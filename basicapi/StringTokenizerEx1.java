package org.java.basicapi;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		System.out.println("StringTokenizerEx1");
		
		String url = "userId=root&userPw=1111&userName=son1";
		StringTokenizer st = new StringTokenizer(url, "&");
		
		System.out.println("��ū��: "+st.countTokens());
		//��� ��ū get
		while(st.hasMoreTokens()) {
			String token = st.nextToken();	//��ū�� �����ϸ� ����
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
