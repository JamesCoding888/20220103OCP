package com.study.ocp.day10;
import java.util.Comparator; 
import java.util.LinkedHashSet;
import java.util.Set;
public class SetExamDemo1 {
	public static void main(String[] args) {
		Exam e1 = new Exam("國文", 100);
		Exam e2 = new Exam("英文", 80);
		Exam e3 = new Exam("數學", 90);
		Exam e4 = new Exam("國文", 100);
		Set<Exam> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(e1);
		linkedHashSet.add(e2);
		linkedHashSet.add(e3);
		linkedHashSet.add(e4);
		System.out.println(linkedHashSet.size());
		System.out.println(linkedHashSet);
		// 最高分 最低分
		int maxScore = linkedHashSet.stream().mapToInt(n -> n.getScore()).max().getAsInt(); // 最高分
		int minScore = linkedHashSet.stream().mapToInt(n -> n.getScore()).min().getAsInt(); // 最低分
		System.out.println(maxScore);
		System.out.println(minScore);
		// 最高分是哪一科
		/* 
		@FunctionalInterface
		public interface Comparator<T> {
			int compare(T o1, T o2);
		*/
		// 原理
		Exam max = linkedHashSet.stream().max((o1, o2) -> o1.getScore() - o2.getScore()).get(); 
		Exam min = linkedHashSet.stream().min((o1, o2) -> o1.getScore() - o2.getScore()).get();
		System.out.println("max = " + max.getName());
		System.out.println("min = " + min.getName());		
		// 進階防待 o1 - o2 或 o2 - o1 
		max = linkedHashSet.stream().max(Comparator.comparing(e -> e.getScore())).get(); 
		min = linkedHashSet.stream().min(Comparator.comparing(Exam::getScore)).get();    
		System.out.println("max = " + max.getName());
		System.out.println("min = " + min.getName());		
	}
}

