package org.java.memberController;

import java.util.Scanner;

import org.java.memberCommend.ActionDeleteDo;
import org.java.memberCommend.ActionInsertDo;
import org.java.memberCommend.ActionSelectDo;
import org.java.memberCommend.ActionUpdateDo;
import org.java.memberCommend.ExcuteCommend;

public class MemberController {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ExcuteCommend commend;
		
		while(true) {
			System.out.println("request URL �Է� (insert.do, select.do, update.do, delete.do) ����: exit");
			String uri = scn.next();
			String basicUrl = uri.substring(0,uri.length()-3);
			System.out.println(basicUrl);
			
			if(basicUrl.equals("insert")) {
				commend = new ActionInsertDo();
				commend.excuteQuery();
			} else if(basicUrl.equals("select")) {
				commend = new ActionSelectDo();
				commend.excuteQuery();
			} else if(basicUrl.equals("update")) {
				commend = new ActionUpdateDo();
				commend.excuteQuery();
			} else if(basicUrl.equals("delete")) {
				commend = new ActionDeleteDo();
				commend.excuteQuery();
			} else if(uri.equals("exit")) {
				System.out.println("�����մϴ�");
				break;
			} else {
				System.out.println("������ �Է� ����");
			}
		}
		
		scn.close();
	}
}	
