package com.study.ocp.day12;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class MapDemo1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("國文", 100);
		map.put("英文", 100);
		map.put("數學", 90);
		map.putIfAbsent("數學", 80); // 若 key 值不存在加入
		map.put("數學", 70);
		System.out.println(map); // 若 key 值存在覆蓋
		Set<String> keys = map.keySet();
		System.out.println("取得所有 keys: " + keys);		
		Collection<Integer> values = map.values();
		System.out.println("取得所有 values: " + values);
		// 取得 key=value 的組合 -> entrySet
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
		// 輪巡 透過 key 來取得 value
		for(String key : keys) {
			System.out.println(key + "=" + map.get(key));			
		}
		// 輪詢 - 透過 entrySet 來取得 key=value 的組合
		for(Map.Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		// 輪詢-java 8 stream
		map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
		//
		System.out.println(map.containsKey("國文")); // key 是否有國文 ?
		System.out.println(map.containsValue(100)); // value 是否有100 ?
	}
}
 