package net.minecraft.server;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

import org.objectweb.asm.ClassReader;

public class ProxyClassBuilder {

	public ProxyClassBuilder() {
	}
	
	public void processClasses(File jarFile, String packagePrefix) throws FileNotFoundException, IOException {
		JarInputStream input = new JarInputStream(new FileInputStream(jarFile));
		for (JarClassIterator i = new JarClassIterator(input); i.hasNext(); ) {
			byte[] bytecode = i.next();
			JarEntry entry = i.getEntry();

			if (entry.getSize() == 0) {
				// minecraft_server.jar has a 0 byte entry called "null"
				// this throws an exception in lots of simple decompilers
				continue;
			}
			
			try {
				ClassReader reader = new ClassReader(bytecode);
				reader.accept(new ProxyClassGenerator(), 0);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Evil class! (" + e.toString() + ")");
			}
		}
	}

	static class JarClassIterator implements Iterator<byte[]> {
		private final JarInputStream input;
		private JarEntry currEntry;

		JarClassIterator(JarInputStream input) {
			this.input = input;
		}

		@Override
		public boolean hasNext() {
			try {
				currEntry = input.getNextJarEntry();
			} catch (IOException e) {
			}
			return currEntry != null;
		}
		
		public JarEntry getEntry() {
			return currEntry;
		}

		@Override
		public byte[] next() {
			int n;
			byte[] buffer = new byte[8192];
			ByteArrayOutputStream baos = new ByteArrayOutputStream(2048);
			try {
				
				while ((n = input.read(buffer, 0, buffer.length)) != -1) {
					baos.write(buffer, 0, n);
				}
				
			} catch (IOException e) {
				throw new NoSuchElementException(e.toString());
			}
			return baos.toByteArray();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	};


	public static void main(String[] args) throws FileNotFoundException, IOException {
		new ProxyClassBuilder().processClasses(new File("/home/mark/.m2/repository/net/minecraft/minecraft-server/20101107.1/minecraft-server-20101107.1.jar"), "");
	}
}
