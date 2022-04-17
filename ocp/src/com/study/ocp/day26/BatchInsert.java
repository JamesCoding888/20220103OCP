package com.study.ocp.day26;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

public class BatchInsert {

	public static void main(String[] args) throws Exception {
		String[] names = {"水泥", "食品", "半導", "光電", "觀光", "金融"};
		String dbUrl = "jdbc:sqlite:src\\com\\study\\ocp\\day26\\demo.db";
		String sql = "insert into classify(name) values(?)";
		Connection conn = DriverManager.getConnection(dbUrl);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.clearBatch();
		for(String name : names) {
			pstmt.setString(1, name);
			pstmt.addBatch();
		}
		int[] rowscounts = pstmt.executeBatch();
		System.out.println("Classify batch insert, rowscounts = " + Arrays.toString(rowscounts));
	}

}
