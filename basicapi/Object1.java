package org.java.basicapi;

class Ob {
	String name;
	int age;

	public Ob() {
		this("root", 1111);
	}

	public Ob(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	// overloading
}

public class Object1 extends Object {
	
	public static void main(String[] args) {
		
		
		Ob ob1 = new Ob();
		Ob ob2 = new Ob();
		Ob ob3 = new Ob("root",22);
		
		System.out.println(ob1.getClass());//클래스 전체 속성
		System.out.println(ob1.getClass().getName());//클래스 이름
		System.out.println(ob1.hashCode());//클래스 해쉬코드, 객체의 고유 주소-객체마다 다름
		System.out.println(ob1.toString());//클래스 문자열
		System.out.println("=========================================");
		System.out.println(ob2.getClass());
		System.out.println(ob2.getClass().getName());
		System.out.println(ob2.hashCode());
		System.out.println(ob2.toString());		
		System.out.println("=========================================");
		System.out.println(ob3.getClass());
		System.out.println(ob3.getClass().getName());
		System.out.println(ob3.hashCode());
		System.out.println(ob3.toString());		
		
	}
}
