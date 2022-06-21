package org.java.basicapi;

import java.util.Scanner;

public class StringEx4 {
	public static void main(String[] args) {
		System.out.println("String 메서드");

		String str = "memberInsert.do";

		System.out.println(str.substring(12)); // 12번지부터 get
		System.out.println(str.substring(0, 12)); // 0번지 부터 12번지 앞(11)까지

		System.out.println(str.substring(0, 4) + "eri" + str.substring(7, 12));

		String insert = "Insert.do";
		String delete = "delete.do";
		String select = "Select.do";
		String update = "Update.do";

		// .do를 제외한 나머지 글자만 가져온다
		System.out.println(insert.substring(0, insert.length() - 3));
		System.out.println(delete.substring(0, delete.length() - 3));
		System.out.println(select.substring(0, select.length() - 3));
		System.out.println(update.substring(0, update.length() - 3));

		Scanner scn = new Scanner(System.in);

		System.out.println("요청 url을 입력하세요(단 마지막은 .do)");
		//입력값은 insert.do, delete.do, update.do, select.do
		String url = scn.next();

		System.out.println("url : " + url);
		// url에서 .do제거
		System.out.println("요청 url을 입력하세요(단 마지막은 .do)");
		String basicURL = url.substring(0, url.length() - 3);
		System.out.println("basicURL : " + basicURL);
		
		if(url.equals("insert.do")) {
			System.out.println("if문 URL : " + basicURL);
		} else if(url.equals("select.do")) {
			System.out.println("if문 URL : " + basicURL);
		} else if(url.equals("update.do")) {
			System.out.println("if문 URL : " + basicURL);
		} else if(url.equals("delete.do")) {
			System.out.println("if문 URL : " + basicURL);
		}
		

	}
}
