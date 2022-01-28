package com.study.ocp.day08_03;

public class Truck extends Car {

	@Override
	public void move() {
		System.out.println("卡車用輪子走");
	}

}