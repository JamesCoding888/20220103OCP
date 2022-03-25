package com.study.ocp.day22;
import java.io.BufferedReader;
import java.io.FileReader;
public class BufferedReaderDemo {
	public static void main(String[] args) {
		String filePath = "src\\com\\study\\ocp\\day22\\data.txt";
		try(FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr)) {			
			String data;
			while((data = br.readLine()) != null) { // null 表示讀到檔尾
				System.out.println(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
