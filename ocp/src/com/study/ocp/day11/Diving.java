package com.study.ocp.day11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Diving {
	public static void main(String[] args) {
		// 10, 8, 7, 6, 5, 9, 9, 4, 8, 7
		// 刪除最高與最低的二個分數
		// 球平均(小數點一位)
		// Arrays.asList 不可變動長度的集合
		List<Integer> list = Arrays.asList(10, 8, 7, 6, 5, 9, 9, 4, 8, 7);
		System.out.println(list);
		Collections.sort(list); // 排序
		System.out.println(list);
		// 將 "不可變動的集合" 放到 "可變動集合中"，例如: ArrayList
		list = new ArrayList<Integer>(list);
		list.remove(0);
		list.remove(0);
		list.remove(list.size()-1);
		list.remove(list.size()-1);
		System.out.println(list);
		double avg = list.stream().mapToInt(Integer::intValue)
								  .summaryStatistics()
								  .getAverage();
		System.out.printf("%.1f\n", avg);
	}
}
