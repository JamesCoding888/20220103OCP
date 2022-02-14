package com.study.ocp.day10;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetDemo4 {
	public static void main(String[] args) {
		// TreeSet 的 element 不重複 且 會 sorted 
		Set<Integer> treeSet = new TreeSet<>();		
		treeSet.add(8);
		treeSet.add(9);
		treeSet.add(5);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(2);
		System.out.println(treeSet);
		// LinkedHashSet 的 element 不重複 但不會 sorted 依照原來的排序
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(8);
		linkedHashSet.add(9);
		linkedHashSet.add(5);
		linkedHashSet.add(3);
		linkedHashSet.add(2);
		linkedHashSet.add(2);
		System.out.println(linkedHashSet);
	}
}
