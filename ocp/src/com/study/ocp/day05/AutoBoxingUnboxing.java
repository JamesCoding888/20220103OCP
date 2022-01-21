package com.study.ocp.day05;

public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		System.out.println(a == b);
		Integer x = Integer.valueOf(100);
		System.out.printf("x: %d\n", x);
		System.out.println(x.intValue() == a); // Java 5.0 以前
		System.out.println(x == a); // Java 5.0 (包含) 之後 auto-unboxing
									// Javac compiler 幫您做
		int c = Integer.valueOf(100); // auto-unboxing
		Integer d = 100; // auto-boxing Integer.valueOf(100)
		
	}
}
