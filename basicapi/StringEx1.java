package org.java.basicapi;

public class StringEx1 {
	public static void main(String[] args) {
		System.out.println("String");
		
		//String ���� ���
		String str0 = "root"; // 1) ��Ʈ�� ���ͷ�
		String srt01 = new String("root");	//2) new
		
		//3) char[]
		char[] ch = {'r', 'o','o','t'};
		String str02 = new String(ch);
		
		String str1 = "root";
		String str2 = "root";
		
		System.out.println(str1==str2);	//�ּ� true
		System.out.println(str1.equals(str2));	//�� ture
		
		String str3= new String("root");
		String str4 = new String("root");
		
		System.out.println(str3==str4);	//�ּ�	false
		System.out.println(str3.equals(str4));	//�� true
	}
}
