package com.study.ocp.day25;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Random;
import com.github.javafaker.Faker;
public class BatchInsert {
	public static void main(String[] args) {
		String sql = "insert into employee(name, age, salary) values(?, ?, ?)";
		String dbUrl = "jdbc:sqlite:src\\main\\java\\day25\\demo.db";
		Faker faker = new Faker();
		Random random = new Random();
		try (Connection conn = DriverManager.getConnection(dbUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);) {			
			pstmt.clearBatch(); // 將上次的清空
			
		for(int i=0; i<1000; i++) {
			pstmt.setString(1, faker.name().firstName());
			pstmt.setInt(2, 20 + random.nextInt(20));
			pstmt.setDouble(3, 2520 + random.nextInt(100000));
			pstmt.addBatch();
		}					
			int[] rowcounts = pstmt.executeBatch(); // 批次執行
			System.out.println(Arrays.toString(rowcounts));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
