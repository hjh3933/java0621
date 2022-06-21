package org.java.basicapi;

public class StringEx1 {
	public static void main(String[] args) {
		System.out.println("String");
		
		//String 积己 规过
		String str0 = "root"; // 1) 胶飘傅 府磐凡
		String srt01 = new String("root");	//2) new
		
		//3) char[]
		char[] ch = {'r', 'o','o','t'};
		String str02 = new String(ch);
		
		String str1 = "root";
		String str2 = "root";
		
		System.out.println(str1==str2);	//林家 true
		System.out.println(str1.equals(str2));	//蔼 ture
		
		String str3= new String("root");
		String str4 = new String("root");
		
		System.out.println(str3==str4);	//林家	false
		System.out.println(str3.equals(str4));	//蔼 true
	}
}
