package org.java.basicapi;

public class Wrapper {
	public static void main(String[] args) {

		// primitive type
		byte b1 = 10;
		short s1 = 10;
		int i1 = 10;
		long l1 = 10;
		float f1 = 1.1f;
		double d1 = 1.1;
		char ch1 = 'a';
		boolean boo1 = true;

		System.out.println("primitive type: " + b1 + " " + s1 + " " + i1 + " " + l1 + " " + f1 + " " + d1 + " " + ch1 + " " + boo1);

		// Wrapper클래스 -> 기본타입을 객체화
		// Wrapper >> Generic타입에 사용 >> 컬렉션에 사용(ArrayList, List, Collection)
		// -> 기본 타입은 사용할 수 없다 -> 객체 타입만 사용
		// 기본타입 -> 객체(박싱)
		Byte b2 = new Byte(b1);
		Short s2 = new Short(s1);
		Integer i2 = new Integer(i1);
		Long l2 = new Long(l1);
		Float f2 = new Float(f1);
		Double d2 = new Double(d1);
		Character ch2 = new Character(ch1);
		Boolean boo2 = new Boolean(boo1);

		System.out.println("Wrapper: " + b2 + " " + s2 + " " + i2 + " " + l2 + " " + f2 + " " + d2 + " " + ch2 + " " + boo2);

		// 객체 -> 기본타입(언박싱)
		byte b3 = b2.byteValue();
		short s3 = s2.shortValue();
		int i3 = i2.intValue();
		long l3 = l2.longValue();
		float f3 = f2.floatValue();
		double d3 = d2.doubleValue();
		char ch3 = ch2.charValue();
		boolean boo3 = boo2.booleanValue();

		System.out.println("기본타입: " + b3 + " " + s3 + " " + i3 + " " + l3 + " " + f3 + " " + d3 + " " + ch3 + " " + boo3);

		//자동 박싱 - java 1.5버전부터 가능
		Byte b22 = b1;
		Short s22 = s1;
		Integer i22 = i1;
		Long l22 = l1;
		Float f22 = f1;
		Double d22 = d1;
		Character ch22 = ch1;
		Boolean boo22 = boo1;
		
		//자동 언박싱 - java 1.5버전부터 가능
		byte b32 = b22;
		short s32 = s22;
		int i32 = i22;
		long l32 = l22;
		float f32 = f22;
		double d32 = d22;
		char ch32 = ch22;
		boolean boo32 = boo22;
	}
}
