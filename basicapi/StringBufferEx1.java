package org.java.basicapi;

public class StringBufferEx1 {

	public static void main(String[] args) {
		System.out.println("String Buffer");
		
		StringBuffer stb = new StringBuffer("root");
		System.out.println(stb);
		
		//�ڿ� �߰�
		stb.append(" PROJECT2022");
		System.out.println(stb);
		//���� (����, ����)
		stb.delete(0, 5);
		System.out.println(stb);
		//�߰� (��ġ, ����)
		stb.insert(0, "root ");
		System.out.println(stb);
		//���� ����
		stb.reverse();
		System.out.println(stb);
		//////////////////////////////////////////////////
		StringBuffer str1 = new StringBuffer("root PROJECT2022");
		System.out.println(str1);
		//replace(����, ����, ��) -> �߰� ���ڿ� ����
		str1.replace(0, 4, "ROOT");
		System.out.println(str1);
		
	}
}
