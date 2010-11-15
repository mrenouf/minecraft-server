package com.bitgrind.minecraft.nbt;

public enum TagType {
  END, BYTE, SHORT, INT, LONG, FLOAT, DOUBLE, BYTE_ARRAY, STRING, LIST, COMPOUND;

  public static TagType decode(int id) {
    try {
      return TagType.values()[id];
    }
    catch (ArrayIndexOutOfBoundsException ex) {
      throw new IllegalArgumentException("Unknown tag type: " + id);
    }
  }
}
