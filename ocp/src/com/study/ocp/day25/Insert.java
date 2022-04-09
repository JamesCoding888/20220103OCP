package com.study.ocp.day25;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Insert {
	public static void main(String[] args) {
//		String sql = "insert into employee(name, age, salary) values('james', 19, 40000)";
		String sql = "insert into employee(name, age, salary) values('david', 20, 50000)";
		String dbUrl = "jdbc:sqlite:src\\main\\java\\day25\\demo.db";
		try(Connection conn = DriverManager.getConnection(dbUrl)) {
			Statement stmt = conn.createStatement();			
			// 使用 executeUpdate 會傳回資料表因為執行此 sql 所變動的筆數
			int rowcount = stmt.executeUpdate(sql);
			System.out.println("Insert rowcount =" + rowcount);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
