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
		
		System.out.println(ob1.getClass());//Ŭ���� ��ü �Ӽ�
		System.out.println(ob1.getClass().getName());//Ŭ���� �̸�
		System.out.println(ob1.hashCode());//Ŭ���� �ؽ��ڵ�, ��ü�� ���� �ּ�-��ü���� �ٸ�
		System.out.println(ob1.toString());//Ŭ���� ���ڿ�
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
