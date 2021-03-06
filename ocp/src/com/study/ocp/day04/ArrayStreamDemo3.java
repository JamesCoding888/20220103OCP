package com.study.ocp.day04;
import java.util.Arrays; 
// Java 8 陣列串流(Stream)
// 串流(Stream) 可以做的有: 
// 過濾(filter), 轉換(map), 分析/統計(statistics), 蒐集(collect), 逐筆呈現(foreach)
public class ArrayStreamDemo3 {
	public static void main(String[] args) {
		int[] nums = {100, 80, 50, 70, 30};		
		// 請求出及格與不及格的平均各是多少 ?
		double passAvg = Arrays.stream(nums)
							   .filter(n -> n >= 60)
							   .average()
							   .getAsDouble();
		System.out.printf("及格的平均: %.1f\n", passAvg);
		double failAvg = Arrays.stream(nums)
				   .filter(n -> n < 60)
				   .average()
				   .getAsDouble();
		System.out.printf("不及格的平均: %.1f\n", failAvg);

		// double 及格的平均
		double[] nums_double = { 90.0, 60.0, 55.0 };
		double avgnum_double_Pass = Arrays.stream(nums_double)
				// DoubleStream filter(DoublePredicate predicate)
				// (double n) ->>> boolean test(double value);
				// (n >= 60) ->>> implemented method
				.filter((double n) -> (n >= 60)).average().getAsDouble();
		System.out.printf("及格的平均: %,.5f\n", avgnum_double_Pass);
		
		// double 不及格的平均
		double avgnum_double_Fail = Arrays.stream(nums_double).filter(n -> n < 60).average().getAsDouble();
		System.out.printf("不及格的平均: %,.5f\n", avgnum_double_Fail);
	}
}