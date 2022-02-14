package com.study.ocp.day10;
import java.util.HashSet; 
import java.util.Set;
public class SetDemo3 {
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(100);
		hashSet.add(null);
		hashSet.add(90);
		hashSet.add(80);
		// 總分 java 8
		int totalScore1 = hashSet.stream().filter(p -> p !=null).reduce(0,Integer::sum).intValue();
		System.out.println(totalScore1);
		// 總分 java 8
		int totalScore2 = hashSet.stream().filter(e -> e!=null).mapToInt(Integer::intValue).sum();
		System.out.println(totalScore2);
	}
}
