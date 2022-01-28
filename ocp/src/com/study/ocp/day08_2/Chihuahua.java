package com.study.ocp.day08_2;

public class Chihuahua implements Dog{

	@Override
	public void eat() {
		System.out.println("吃狗飼料");		
	}

	@Override
	public void skill() {
		System.out.println("賣萌");		
	}	
}
