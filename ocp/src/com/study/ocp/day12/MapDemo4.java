package com.study.ocp.day12;
import java.util.Arrays; 
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class MapDemo4 {
	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("apple", 10, 10), // 一箱水果
				new Fruit("banana", 10, 15),
				new Fruit("papaya", 15, 15),
				new Fruit("orange", 10, 20),
				new Fruit("melon", 40, 20),
				new Fruit("apple", 15, 10),
				new Fruit("apple", 20, 10),
				new Fruit("banana", 25, 15),
				new Fruit("orange", 30, 20));		
				
		// 請問每個水果有幾箱 ? 
		// apple = 3, banana = 2, papaya = 1, orange = 2, melon =1
		Map<String, Long> result1 = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));
		System.out.println(result1);
		
		// 請問每個水果有幾棵 ?
		// apple = 45, banana = 35 ...
		Map<String, Integer> result2 = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getName, Collectors.summingInt(Fruit::getQty)));
		System.out.println(result2);
		// 請問每個水果總統計 ?
		Map<String, IntSummaryStatistics> result3 = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getName, Collectors.summarizingInt(Fruit::getQty)));
		System.out.println(result3);
		// 根據水果價格來分類
		// 10=[apple], 15=[banana, papaya], ....
		Map<Integer, List<Fruit>> result4 = fruits.stream().collect(Collectors.groupingBy(Fruit:: getPrice));
		System.out.println(result4);
		
		// 去除重複資料
		Map<Integer, Set<String>> result5 = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getPrice, Collectors.mapping(Fruit::getName, Collectors.toSet())));						
		System.out.println(result5);
					
		// 水果加總
		// {orange=800, papaya=225, banana=525, apple=450, melon=800}
		// 2800
		Map<String, Integer> result6 = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getName, Collectors.summingInt(fruit -> fruit.getPrice() * fruit.getQty())));
		System.out.println(result6);
		
		int sum = result6.entrySet().stream().mapToInt(entry -> entry.getValue()).sum();
		System.out.println(sum);
	}
}
