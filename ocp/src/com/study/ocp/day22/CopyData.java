package com.study.ocp.day22;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CopyData {
	public void copyDataFunction() {
		String sourcePath = "src\\com\\study\\ocp\\day22\\data.txt";
		String destPath = "src\\com\\study\\ocp\\day22\\data.backup.txt";
		try(FileReader fr = new FileReader(sourcePath);
			FileWriter fw = new FileWriter(destPath);) {
			char[] buffer = new char[1]; // char[X] 一次讀 X 個字			
			while(fr.read(buffer) != -1) { // 將資料讀進 buffer 並判斷是否讀到檔尾 -1
				fw.write(buffer);									
			}		
		} catch (IOException e) {
			e.printStackTrace();
		} 	
		System.out.println("Copy Ok!");
	}
}
