package com.study.ocp.day04;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

// Java 8 陣列串流(Stream)
// 串流(Stream) 可以做的有: 
// 過濾(filter), 轉換(map), 分析/統計(statistics), 蒐集(collect), 逐筆呈現(foreach)
public class ArrayStreamDemo2 {
	public static void main(String[] args) {
		int[] nums = {100, 80, 50, 70, 30};
		// 統計物件
		IntSummaryStatistics stat =  Arrays.stream(nums).summaryStatistics();
		System.out.printf("統計資料: %s\n", stat);
		System.out.printf("總分: %d\n", stat.getSum());
		System.out.printf("平均: %.1f\n", stat.getAverage());
		System.out.printf("最大: %d\n", stat.getMax());
		System.out.printf("最小: %d\n", stat.getMin());
		System.out.printf("個數: %d\n", stat.getCount());
		// 逐筆呈現(foreach) lambda 語法
		Arrays.stream(nums).forEach(n -> System.out.println(n));
		// 逐筆呈現(foreach) lambda 語法 :: 方法參考
		Arrays.stream(nums).forEach(System.out::println);
	}
}