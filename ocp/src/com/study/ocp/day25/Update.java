package com.study.ocp.day25;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
public class Update {
	public static void main(String[] args) {
		String sql = "update employee set salary = ? where id= ? ";
		String dbUrl = "jdbc:sqlite:src\\main\\java\\day25\\demo.db";		 
		 try(Connection conn = DriverManager.getConnection(dbUrl); 
		     PreparedStatement pstmt = conn.prepareStatement(sql);){
			 pstmt.setDouble(1, new Random().nextInt(1000000));
			 pstmt.setInt(2, 1);
			 int rowcount = pstmt.executeUpdate();			 
			 System.out.println("Update rowcount = " + rowcount);			 
//			 pstmt.executeUpdate();			 			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
