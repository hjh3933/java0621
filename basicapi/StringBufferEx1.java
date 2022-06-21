package org.java.basicapi;

public class StringBufferEx1 {

	public static void main(String[] args) {
		System.out.println("String Buffer");
		
		StringBuffer stb = new StringBuffer("root");
		System.out.println(stb);
		
		//뒤에 추가
		stb.append(" PROJECT2022");
		System.out.println(stb);
		//삭제 (시작, 개수)
		stb.delete(0, 5);
		System.out.println(stb);
		//추가 (위치, 내용)
		stb.insert(0, "root ");
		System.out.println(stb);
		//순서 변경
		stb.reverse();
		System.out.println(stb);
		//////////////////////////////////////////////////
		StringBuffer str1 = new StringBuffer("root PROJECT2022");
		System.out.println(str1);
		//replace(시작, 개수, 값) -> 중간 문자열 변경
		str1.replace(0, 4, "ROOT");
		System.out.println(str1);
		
	}
}
