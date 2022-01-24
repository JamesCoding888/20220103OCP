package com.study.ocp.day06;

import java.lang.reflect.Method;

public class PersonTest2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.getClass().getName());
		System.out.println(p1.getClass().getSimpleName());
		for(Method method : p1.getClass().getMethods()) {
			System.out.println(method.getName());
		}
		
		Student s1 = new Student("Vincent", 18, 100);
		System.out.println(s1);
		System.out.println(s1.getClass().getName());
		System.out.println(s1.getClass().getSimpleName());
		Teacher t1 = new Teacher("Anita", 30, 70000);
		System.out.println(t1);
		
	}
}
