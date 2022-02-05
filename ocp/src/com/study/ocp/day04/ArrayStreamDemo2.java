package com.study.ocp.day04;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
// Java 8 陣列串流(Stream)
// 串流(Stream) 可以做的有: 
// 過濾(filter), 轉換(map), 分析/統計(statistics), 蒐集(collect), 逐筆呈現(foreach)
public class ArrayStreamDemo2 {
	public static void main(String[] args) {
		// int
		int[] nums = {100, 80, 50, 70, 30};
		// double
		double[] nums_double = { 1000.0, 9500.0, 850.0 };			
		// 統計物件 - IntSummaryStatistics 
		IntSummaryStatistics stat =  Arrays.stream(nums).summaryStatistics();
		System.out.printf("統計資料: %s\n", stat);
		System.out.printf("總分: %d\n", stat.getSum());
		System.out.printf("平均: %.1f\n", stat.getAverage());
		System.out.printf("最大: %d\n", stat.getMax());
		System.out.printf("最小: %d\n", stat.getMin());
		System.out.printf("個數: %d\n", stat.getCount());
		// 統計物件 - DoubleSummaryStatistics 
		DoubleSummaryStatistics summaryStat_nums_double = Arrays.stream(nums_double).summaryStatistics();
		System.out.printf("統計資料: %s\n", summaryStat_nums_double);
		System.out.printf("統計資料的最大值: %f\n", summaryStat_nums_double.getMax());
		System.out.printf("統計資料的最小值: %f\n", summaryStat_nums_double.getMin());
		System.out.printf("統計資料的平均值: %f\n", summaryStat_nums_double.getAverage());
		System.out.printf("統計資料的加總: %f\n", summaryStat_nums_double.getSum());
		System.out.printf("統計資料的個數: %d\n", summaryStat_nums_double.getCount());
		// 逐筆呈現(foreach) lambda 語法
		Arrays.stream(nums).forEach(n -> System.out.println(n));
		Arrays.stream(nums_double).forEach( s -> System.out.println(s));
		// 逐筆呈現(foreach) lambda 語法 :: 方法參考
		Arrays.stream(nums).forEach(System.out::println);
		Arrays.stream(nums_double).forEach(System.out::println);
	}
}