package org.java.basicapi;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		System.out.println("StringTokenizerEx1");
		
		String url = "userId=root&userPw=1111&userName=son1";
		StringTokenizer st = new StringTokenizer(url, "&");
		
		System.out.println("토큰수: "+st.countTokens());
		//모든 토큰 get
		while(st.hasMoreTokens()) {
			String token = st.nextToken();	//토큰이 존재하면 실행
			//userId = root
			//userPw = 1111
			//userName = son1
			System.out.println(token);
		}
		//StringTokenizer
		String phone = "010-1111-0000";
		StringTokenizer st2 = new StringTokenizer(phone, "-");
		while(st2.hasMoreTokens()) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		
	}
}
