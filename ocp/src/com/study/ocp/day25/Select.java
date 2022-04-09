package com.study.ocp.day25;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class Select {
	public static void main(String[] args) {
//		 String sql = "select * from employee"; // ä¸�å»ºè­°ä½¿ç”¨ *
//		 String sql = "select id, name, age, salary from Employee";
		 String sql = "select id, name, age, salary from Employee order by salary desc"; // ç”±å¤§åˆ°å°�
//		 String sql = "select id, name, age, salary from Employee order by salary asc"; // ç”±å°�åˆ°å¤§
		 String dbUrl = "jdbc:sqlite:src\\main\\java\\day25\\demo.db";		 
		 try(Connection conn = DriverManager.getConnection(dbUrl); 
		     Statement stmt = conn.createStatement();
		     ResultSet rs = stmt.executeQuery(sql);) {
			 ResultSetMetaData sm = rs.getMetaData();
			 System.out.println(sm);
			 System.out.println("Total column of Table: "+ sm.getColumnCount());
			 System.out.println("getColumnName:" + sm.getColumnName(1) + " " + 
					 			sm.getColumnName(2) + " " + 
					 			sm.getColumnName(3) + " " +
					 			sm.getColumnName(4));
			 
			 // åˆ©ç”¨ while å°‡ rs é›†å�ˆå…§çš„è³‡æ–™ä¾�åº�é¡¯ç¤ºå‡º
			 System.out.println("Select èªžæ³•æŠ“å‡º demo.db çš„ Employee Table å¦‚ä¸‹");
			 System.out.println("id"+"\t"+ "name" + "\t" + "age" + "\t" + "salary");
			 System.out.println("--------------------------------");
			 while(rs.next()) {
				 int id = rs.getInt("id");
				 String name = rs.getString("name");
				 int age = rs.getInt("age");
				 double salary = rs.getDouble("salary"); // real å°�æ‡‰åˆ° double
				 System.out.println(id + "\t" + name + "\t" + age + "\t" + salary);
			 }			  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
