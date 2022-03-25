package com.study.ocp.day22;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo1 {
	public static void main(String[] args) {
		String filePath = "src\\com\\study\\ocp\\day22\\data.txt";
		// 1. Open stream
		FileReader fr = null;
		try {
			fr = new FileReader(filePath);
			// 2. while information
			char[] buffer = new char[1]; // char[X] 一次讀 X 個字
			while(fr.read(buffer) != -1) { // 將資料讀進 buffer 並判斷是否讀到檔尾 -1
				System.out.print(buffer[0]); // 將資料印出								
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. Close stream
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
