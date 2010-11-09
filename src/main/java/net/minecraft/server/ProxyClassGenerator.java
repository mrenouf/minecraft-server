package net.minecraft.server;

import static java.lang.System.out;

import java.util.Arrays;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

class ProxyClassGenerator implements ClassVisitor {
	String marker;

	public ProxyClassGenerator() {
		char[] marker = new char[60];
		Arrays.fill(marker, '-');
		this.marker = String.valueOf(marker) + "%n";
	}

	@Override
	public void visit(int version, int access, String name, String signature,
			String superName, String[] interfaces) {
		out.format(
				"Class: version=%d, access=%08x, name=\"%s\", signature=\"%s\", superName=\"%s\", interfaces=\"%s\"%n",
				version, access, name, signature, superName, Arrays.asList(interfaces));
	}

	@Override
	public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
		out.format("Annotation: dec=\"%s\", visible=%s%n", desc, visible);
		return null;
	}

	@Override
	public void visitAttribute(Attribute attr) {
		out.format("Attribute: type=\"%s\", codeAttribute=%s%n", attr.type,
				attr.isCodeAttribute());
	}

	@Override
	public FieldVisitor visitField(int access, String name, String desc,
			String signature, Object value) {
		out.format(
				"Field: access=%08x, name=\"%s\", desc=\"%s\", signature=\"%s\", value=%s%n",
				access, name, desc, signature, (value == null ? "(null)"
						: value));
		return null;
	}

	@Override
	public void visitInnerClass(String name, String outerName,
			String innerName, int access) {
		out.format(
				"InnerClass: name=\"%s\", outerName=\"%s\", innerName=\"%s\", access=\"%08x\"%n",
				name, outerName, innerName, access);
	}

	@Override
	public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
		out.format("Method: access=%08x, name=\"%s\", desc=\"%s\", signature=\"%s\", exceptions=%s%n",
				access, name, desc, signature, (exceptions == null ? "(null)" : Arrays.asList(exceptions)));
		return null;
	}

	@Override
	public void visitOuterClass(String owner, String name, String desc) {
		out.format("OuterClass: owner=\"%s\", name=\"%s\", desc=\"%s\"%n",
				owner, name, desc);
	}

	@Override
	public void visitSource(String source, String debug) {
		out.format("Source: source=\"%s\", debug=\"%s\"%n", source, debug);
	}

	@Override
	public void visitEnd() {
		out.format(marker);
	}
}