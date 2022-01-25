package com.study.ocp.day03;

import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		String words = "She sells sea shell on the sea shore";
		System.out.println(words);
		// words 的長度
		System.out.println(words.length());		
		// 有沒有 on 這個字
		System.out.printf("on 的位置在: %d\n", words.indexOf("on"));
		// 有沒有 off 這個字 如果沒有顯示 -1
		System.out.printf("off 的位置在: %d\n", words.indexOf("off"));
		// 有幾個字 ? 提示: split()
		String[] wordarray = words.split(" ");
		System.out.println(Arrays.toString(wordarray));
		System.out.println(wordarray.length);		
	}
}
