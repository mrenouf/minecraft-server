package com.bitgrind.minecraft.nbt;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.junit.Test;

public class NBTReaderTest {

	String indent(int depth) {
		char[] c = new char[depth];
		Arrays.fill(c, '\t');
		return new String(c);
	}

	@Test
	public void testLevel() throws IOException {
		InputStream in = NBTReaderTest.class.getClassLoader()
				.getResourceAsStream("level.dat");
		NbtReader reader = new NbtReader(in);
		dump(reader);
	}

	@Test
	public void testPlayer() throws IOException {
		InputStream in = NBTReaderTest.class.getClassLoader()
				.getResourceAsStream("player.dat");
		NbtReader reader = new NbtReader(in);
		dump(reader);
	}

	@Test
	public void testWorld() throws IOException {
		InputStream in = NBTReaderTest.class.getClassLoader()
				.getResourceAsStream("worldchunk.dat");
		NbtReader reader = new NbtReader(in);
		dump(reader);
	}

	private void dump(NbtReader reader) throws IOException {
		String value = "";
		while (reader.nextTag() != TagType.END || reader.getDepth() > 0) {
			switch (reader.getTagType()) {
			case BYTE_ARRAY:
				byte[] foo = reader.getValue();
			    value = Arrays.toString(foo).toString();
				break;
			default:
				value = (reader.getValue() != null) ? reader.getValue().toString() : "";
			}
			System.out.println(indent(reader.getDepth()) + reader.getTagType()
					+ " " + reader.getTagName() + " " + value);
		}
		System.out.println(indent(reader.getDepth()) + reader.getTagType()
				+ " " + reader.getTagName() + " " + value);
	}
}
