package com.bitgrind.minecraft.nbt;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Deque;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;

public class NbtReader {
	private final DataInputStream in;
	private int depth;
	private TagType tagType;
	private String tagName = "";
	private TagType listType;
	private int listLength;
	private int listIndex;

	private Deque<TagContext> stack = new LinkedList<TagContext>();
	private Object value;

	static class TagContext {
		int depth;
		public Object value;
		String tagName;
		TagType listType;
		int listLength;
		int listOffset;

		public TagContext(int depth, String tagName, Object value,
				TagType listType, int listLength, int listOffset) {
			this.depth = depth;
			this.tagName = tagName;
			this.value = value;
			this.listType = listType;
			this.listLength = listLength;
			this.listOffset = listOffset;
		}
	}
	
	public NbtReader(InputStream in) throws IOException {
		this.in = new DataInputStream(new GZIPInputStream(in));
	}

	/** For testing */
	NbtReader() {
		in = null;
	}

	void pushContext() {
		stack.push(new TagContext(depth, tagName, value, listType, listLength,
				listIndex));
	}

	void popContext() {
		TagContext ctx = stack.pop();
		this.depth = ctx.depth;
		this.value = ctx.value;
		this.tagName = ctx.tagName;
		this.listType = ctx.listType;
		this.listLength = ctx.listLength;
		this.listIndex = ctx.listOffset;
		if (tagType == TagType.LIST) {
			listIndex++;
		}
	}

	public TagType nextTag() throws IOException {
		if (tagType == TagType.COMPOUND || tagType == TagType.LIST) {
			depth++;
		}
		if (listType != null) {
			listIndex++;
			tagType = listType;
			if (listIndex >= listLength) {
				popContext();
			}
		}
		if (listType == null) {
			int nextTagByte = in.readByte();
			tagType = TagType.decode(nextTagByte);
		}
		if (tagType != TagType.END && listType == null) {
			tagName = in.readUTF();
		} else {
			tagName = "";
		}

		switch (tagType) {
		case END:
			popContext();
			break;
		case BYTE:
			value = in.readByte();
			break;
		case BYTE_ARRAY:
			int length = in.readInt();
			byte[] array = new byte[length];
			in.readFully(array);
			value = array;
			break;
		case DOUBLE:
			value = in.readDouble();
			break;
		case FLOAT:
			value = in.readFloat();
			break;
		case INT:
			value = in.readInt();
			break;
		case LONG:
			value = in.readLong();
			break;
		case SHORT:
			value = in.readShort();
			break;
		case STRING:
			value = in.readUTF();
			break;
		case LIST:
			pushContext();
			listIndex = -1;
			listType = TagType.decode(in.readByte());
			listLength = in.readInt();
			value = null;
			break;
		case COMPOUND:
			pushContext();
			listType = null;
			value = null;
			break;
		}
		return tagType;
	}

	public TagType getTagType() {
		return tagType;
	}

	public String getTagName() {
		return tagName;
	}

	public TagType getListType() {
		return listType;
	}

	public int getListLength() {
		return listLength;
	}

	public int getListIndex() {
		return listIndex;
	}

	@SuppressWarnings("unchecked")
	public <T> T getValue() {
		return (T) value;
	}

	public int getDepth() {
		return depth;
	}
}
