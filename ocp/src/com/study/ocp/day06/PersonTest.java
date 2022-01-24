package com.study.ocp.day06;

public class PersonTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("James");
		s1.setAge(20);
		s1.setScore(80);
		
		Teacher t1 = new Teacher();
		t1.setName("Anita");
		t1.setAge(30);
		t1.setSalary(70000);
		
		System.out.println(s1);
		System.out.println(t1);
	}
}
