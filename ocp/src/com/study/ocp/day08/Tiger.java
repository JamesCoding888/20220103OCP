package com.study.ocp.day08;
public class Tiger extends Cat {
	@Override
	public void move() {
//		super.move();
		System.out.println("Tiger 會跑");		
	}	
	public void shout() {
		System.out.println("Tiger 吼叫");
	}
}
