package org.java.basicapi;

public class StringEx2 {
	public static void main(String[] args) {
		System.out.println("String");

		String str1 = " root PROJECT2022 ";
		// replace ("�������ڿ�","�ٲ� ���ڿ�")
		System.out.println(str1.replace("root", "ROOT"));
		System.out.println(str1);
		String str2 = "userId,userPw,userName,userAge";
		String[] strArr = str2.split(","); // split("������")�� �̷��Ͽ� �迭ȭ
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println("=========================================");
		// �迭�� ��ü �ݺ�
		for (String str : strArr) {
			System.out.println(str);
		}

		String phone = "010-1111-0000";
		String[] strArr2 = phone.split("-");
		for (int i = 0; i < strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}

		String str3 = "root";
		String str4 = "root";
		String str5 = " root2022 ";
		// �빮��
		System.out.println(str3.toUpperCase());
		// �ҹ���
		System.out.println(str4.toLowerCase());
		// ���ڱ���
		System.out.println(str5.length());
		// ��������
		String str6 = str5.trim();
		System.out.println(str6.length()); // ���� 2�� �����

	}
}
