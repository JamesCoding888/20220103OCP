package com.study.ocp.day15;

public class Sport{
	public static void main(String[] args) {
		Walk walk = new Walk();
		Jogging jogging = new Jogging();
		
		Thread t1 = new Thread(walk, "John");
		Thread t2 = new Thread(jogging, "Mary");
		t1.start();
		t2.start();
	}
}