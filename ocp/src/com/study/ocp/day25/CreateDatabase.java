package com.study.ocp.day25;
import java.sql.Connection;
import java.sql.DriverManager;
public class CreateDatabase {
	public static void main(String[] args) {
		// è‹¥æ˜¯ä½¿ç”¨ JDBC 3.0æˆ–åœ¨Webä¸Šä½¿ç”¨ éœ€è¦�åˆ©ç”¨ Class.forName() ä¾†å‹•æ…‹å»ºç«‹ Driver å¯¦é«”
		// JDBC 4.0 å‰‡ä¸�ç”¨
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		// è³‡æ–™åº«é€£ç·šä½�ç½®
		String dbUrl = "jdbc:sqlite:src\\main\\java\\day25\\demo.db";
		//String username = ""; // é€£çµ�ä½¿ç”¨ sqlite ä¸�ç”¨ username èˆ‡ password
		//String password = "";
		try(Connection conn = DriverManager.getConnection(dbUrl)) {
			System.out.println("è³‡æ–™åº«å»ºç«‹æˆ�åŠŸ !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
