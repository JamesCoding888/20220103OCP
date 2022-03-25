package com.study.ocp.day22;
import java.io.FileReader; 
import java.io.IOException;
public class FileReaderDemo2 {
	public static void main(String[] args) {
		String filePath = "src\\com\\study\\ocp\\day22\\data.txt";
		// 結束後會自動執行 Close 方法
		try(FileReader fr = new FileReader(filePath)) {
			char[] buffer = new char[1];
			while(fr.read(buffer) !=-1){
				System.out.print(buffer[0]);
			}
		} catch (IOException e) {
			e.printStackTrace();
			
			
		}
	}
}
