package com.study.ocp.day12;
import static java.util.stream.Collectors.groupingBy;  
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summarizingInt;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.Map.Entry;
public class MapDemo3 {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "apple", "banana", "orange", "apple", "papaya", "watermelon");
		// 輸出: apple=3, orange=2, banana=1, papaya=1, watermelon=1
		// 第一種寫法
		Map<String, Long> result1 = fruits.stream()
										  .collect(groupingBy(x -> x, counting()));															
		System.out.println(result1);
		// 第二種寫法		
		Map<String, Long> result2 = fruits.stream()
									      .collect(groupingBy(Function.identity(), counting())); //.collect(groupingBy(元素->元素, counting()));
		System.out.println(result2);
		
		//=========================================================================
		// 輸出: apple=3, orange=2, banana=1, papaya=1, watermelon=1 (加入排序功能)
		// 排完之後要放到 Map<String, Long> sortedMap = new LinkedHashMap<>();
		
		// 先做驗證
		// 1. 對 key 大小作排序
		result2.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		// 2. 對 value 大小作排序		
		result2.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		// 3. 對 key 大小作反排序 - <String, Long>comparingByKey() 須加上型別
		result2.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByKey().reversed()).forEach(System.out::println);
		
		// 實際操作 1
		Map<String, Long> sortedMap1 = new LinkedHashMap<>();
		result2.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
								 //.soted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
								   .forEach(entry -> sortedMap1.put(entry.getKey(), entry.getValue()));
		System.out.println(sortedMap1);
		// 實際操作 2
		Map<String, Long> sortedMap2 = new LinkedHashMap<>();
		result2.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
								   .forEach(entry -> sortedMap2.put(entry.getKey(), entry.getValue()));
		System.out.println(sortedMap2);

		
		// 實際操作 3 - Vincent's code
		// homework: think about (oldValue, newValue) -> oldValue ?
		Map<String, Long> newMap = result2.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(toMap(Entry::getKey, Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println(newMap);
		//=========================================================================
	}
}
 