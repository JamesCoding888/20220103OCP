package com.study.ocp.day23;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
public class NewFileReaderDemo {
	public static void main(String[] args) {
		Path path = Paths.get("src\\com\\study\\ocp\\day23\\words.txt");
//		/*
		// 1. BufferReader + FileReader
		System.out.println("=== BufferedReader 印出的結果 ===");
		try(FileReader fr = new FileReader(path.toFile());
			BufferedReader br = new BufferedReader(fr);) {
			br.lines() // 串流 Stream			  
			  .forEach(System.out::println); // 印出資料
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=================================");
//		 */
		
//		/*
		// 2.Files.newBufferedReader(path)
		System.out.println("=== Files.newBufferedReader(path) 印出的結果 ===");
		try(BufferedReader br = Files.newBufferedReader(path) ) {
			br.lines() // 串流 Stream			  
			  .forEach(System.out::println); // 印出資料
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=================================");
//		 */
		
//		/*
		// 3. Files.lines(path)
		// 因為來源是檔案, 所以仍須放在 try() 中
		System.out.println("=== newBufferedReader 印出的結果 ===");
		try(Stream<String> s = Files.lines(path)){
			s.forEach(System.out::println);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("=================================");
//		 */
//		/*
		// 4. Files.readAllLines() 可以獲取資料集合
		// 不必放在 try() 中
		System.out.println("=== Files.readAllLines()印出的結果 ===");
		try {
			List<String> list = Files.readAllLines(path);
			list.forEach(System.out::println);
			System.out.println(list.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
//		 */			
	}
}
