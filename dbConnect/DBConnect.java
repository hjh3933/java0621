package org.java.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConntection() {
		
		Connection conn = null;
		
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password ="1234";
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 OK");
			
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("DB연동 OK");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 설치 오류");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB SQL오류");
		}
		
		return conn;
	}
}
