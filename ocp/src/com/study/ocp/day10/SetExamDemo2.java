package com.study.ocp.day10;
import java.util.Set;  
import java.util.TreeSet;
public class SetExamDemo2 implements Comparable{
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		Exam e1 = new Exam("國文", 100);
		Exam e2 = new Exam("英文", 80);
		Exam e3 = new Exam("數學", 90);
		Exam e4 = new Exam("國文", 100);		
		Set<Exam> treeSet = new TreeSet<>();
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);			
		int Max = new SetExamDemo2().compareTo(treeSet);
		System.out.println(Max);
//		System.out.println(treeSet.size());
//		System.out.println(treeSet); 
		
		
		
	}
}

