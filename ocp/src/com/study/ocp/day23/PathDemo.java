package com.study.ocp.day23;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathDemo {
	public static void main(String[] args) {		
		// 絕對路徑
		Path pathOfAbsolute = Paths.get("C:\\Users\\jamesliao\\git\\ocp\\ocp\\src\\com\\study\\ocp\\day23\\PathDemo.java");  
		System.out.println("===== pathOfAbsolute =====");
		System.out.println(pathOfAbsolute);
		System.out.printf("getFileName: %s\n", pathOfAbsolute.getFileName());
		System.out.printf("getParent: %s\n", pathOfAbsolute.getParent());
		System.out.printf("getRoot: %s\n", pathOfAbsolute.getRoot());
		System.out.printf("isAbsolute: %s\n", pathOfAbsolute.isAbsolute());
		// subPath(from, to) 範圍 from <= path < to
		System.out.printf("subPath(0, 2): %s\n", pathOfAbsolute.subpath(0, 2));
		// 相對路徑
		Path pathOfRelated = Paths.get("src\\com\\study\\ocp\\day23\\PathDemo.java"); 
		System.out.println("===== pathOfRelated =====");
		System.out.println(pathOfRelated);
		System.out.printf("getFileName: %s\n", pathOfRelated.getFileName());
		System.out.printf("getParent: %s\n", pathOfRelated.getParent());
		System.out.printf("getRoot: %s\n", pathOfRelated.getRoot());
		System.out.printf("isAbsolute: %s\n", pathOfRelated.isAbsolute());
		// subPath(from, to) 範圍 from <= path < to
		System.out.printf("subPath(0, 2): %s\n", pathOfRelated.subpath(0, 2));
		if(!pathOfRelated.isAbsolute()) {
			// 取得絕對路徑
			System.out.println(pathOfRelated.toAbsolutePath());
		}
		// 換成 uri 格式
		URI uri = pathOfRelated.toUri();
		System.out.println(uri);		
	}
}
