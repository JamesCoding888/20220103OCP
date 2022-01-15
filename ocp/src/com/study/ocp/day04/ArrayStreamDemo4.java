package com.study.ocp.day04;


import java.util.Arrays;
import java.util.IntSummaryStatistics;

// Java 8 陣列串流(Stream)
// 串流(Stream) 可以做的有: 
// 過濾(filter), 轉換(map), 分析/統計(statistics), 蒐集(collect), 逐筆呈現(foreach)
public class ArrayStreamDemo4 {
	public static void main(String[] args) {
		String[] names = {"John", "jo", "Helen", "Vincent", "Anita"};
		// 求名字平均字母數
		double avg = Arrays.stream(names)
							//.sequential() // 序列
							.parallel() // 平行
							.mapToInt(n -> n.length())
							.peek(System.out::println) // 觀察串流的元素資料
							.average()
							.getAsDouble();
		System.out.printf("平均字母數: %.1f\n", avg);
		
	}
}
