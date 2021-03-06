package org.java.date;

import java.util.Calendar;

public class CalenderEx1 {
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime());
		System.out.println(Calendar.YEAR); // 객체 생성 없이 소환 -> 클래스 멤버
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		System.out.println(Calendar.HOUR);
		System.out.println(Calendar.HOUR_OF_DAY);
		System.out.println(Calendar.MINUTE);
		System.out.println(Calendar.SECOND);
		System.out.println(Calendar.MILLISECOND);

		System.out.println(now.get(Calendar.YEAR) + "년 " + (now.get(Calendar.MONTH)+1) + "월 " + now.get(Calendar.DATE) + "일 "
				+ now.get(Calendar.HOUR) + "시 " + now.get(Calendar.MINUTE) + "분 " + now.get(Calendar.SECOND) + "초");
	}
}
