package com.study.ocp.day22;
import java.io.FileWriter;
import java.util.Date;
public class FileWriterDemo {
	public static void main(String[] args) {
		String filePath = "src\\com\\study\\ocp\\day22\\foo.txt";
		try(FileWriter fw = new FileWriter(filePath,false);) { 
			String data1 = "RealTime:" +  new Date().toString();			
			String data2 = "\n";
			String data3 = "Welcome!";
			fw.write(data1);
			fw.write(data2);
			fw.write(data3);
			System.out.println("File 內容寫入成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
