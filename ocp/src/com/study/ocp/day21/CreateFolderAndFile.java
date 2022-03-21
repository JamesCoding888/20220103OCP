// File.separator: 根據 '/' 是依據電腦系統來配置 
package com.study.ocp.day21;
import java.io.File;
import java.io.IOException;
public class CreateFolderAndFile {
	public static void main(String[] args) {
		String basePath = "src/com/study/ocp/day21";
		String folderName = "files";
		String fileName = "data.txt";
		File path = new File(basePath + "/" + File.separator + folderName );
		if(!path.exists()) { // folder if exist ? true : false
			// 建立資料夾
			path.mkdir();
//			path.mkdirs(); // 至少兩個資料夾以上
			System.out.println("建立資料夾成功");
		} else {
			System.out.println(folderName + "資料夾已存在");
		}
		File file = new File(path.getPath() + File.separator + fileName);
		if(!file.exists()) {
			// 建立檔案
			try {
				file.createNewFile(); // 記得 try-catch
				System.out.println("建立檔案成功");
			} catch(IOException e) {
				e.printStackTrace();
			}			
		} else {
			System.out.println(fileName + "檔案已存在");
		}
	}
}
