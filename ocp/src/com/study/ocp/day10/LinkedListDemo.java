package com.study.ocp.day10;
import java.util.LinkedList; 
import java.util.List;
public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> strList = new LinkedList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		System.out.println(strList);
		strList.remove("A");
		System.out.println(strList);
		
		List<Integer> intList1 = new LinkedList<>();
		intList1.add(1);
		intList1.add(2);
		intList1.add(3);
		System.out.println(intList1);
		intList1.remove(1); // 不是 remove "1" 而是 "2" 唷 ! 
		System.out.println(intList1);
		List<Integer> intList2 = new LinkedList<>();
		intList2.add(1);// auto-boxing to Integer 1
		intList2.add(2);// auto-boxing to Integer 2
		intList2.add(3);// auto-boxing to Integer 3
		// intList1 的 element 是 Integer type
		// 因此要刪除 "1" 就必須讓 remove(int element -> Integer element)
		intList2.remove(Integer.valueOf(1)); 
		System.out.println(intList2);		
	}
}
