package com.study.ocp.day07;
public class Son extends Father {
	int money = 200;
	public Son() {
		this(10); // this() must be 1st of constructor
		System.out.println("C");	
	}
	public Son(int x) {
		super(); // super() must be 1st of constructor
		System.out.println("D");
	}
	public void printMoney() {		
		System.out.println(money);
		System.out.println(this.money);
		System.out.println(super.money);
	}
}
