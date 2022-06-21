package org.java.basicapi;

public class StringEx3 {
	public static void main(String[] args) {
		System.out.println("String 메서드");
		
		String str1 = "root";
		String str2 = " PROJECT2022 ";
		//index 문자값
		System.out.println(str2.charAt(1));
		//index 아스키코드값
		System.out.println(str1.codePointAt(1));
		// 두 문자열 사전 순  같으면 0, 먼저 - , 나중 +
		System.out.println("root1".compareTo("root2"));
		System.out.println("root2".compareTo("root2"));
		System.out.println("root3".compareTo("root2"));
		//문자열 결합
		System.out.println(str1.concat(str2));
		String str3 =  str1.concat(str2);
		System.out.println(str3);
		//포함되어 있는가? -> 논리값
		System.out.println(str3.contains("root"));
		//문자열 길이
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
	
	}
}
