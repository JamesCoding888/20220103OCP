package com.study.ocp.day25;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Delete {
	public static void main(String[] args) {
		String sql = "delete from employee where id = ? ";
		String dbUrl = "jdbc:sqlite:src\\main\\java\\day25\\demo.db";
		try(Connection conn = DriverManager.getConnection(dbUrl)) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,2);
			int rowcount = pstmt.executeUpdate();
			System.out.println("Delete rowcount =" + rowcount);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
