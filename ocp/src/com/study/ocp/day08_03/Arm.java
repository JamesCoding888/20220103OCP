package com.study.ocp.day08_03;

import java.util.stream.Stream;

public class Arm {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Truck truck = new Truck();
		Fighter fighter = new Fighter();
		
		Car[] cars = {tank, truck};
		Airplane[] airplanes = {fighter };
		Weapon[] weapons = {tank, fighter} ;
		
		Object[] army = {cars, airplanes, weapons};
		// 試問加總有元素 5 個 要如何實作 ? Homework			
		Stream.of(army).peek(System.out::println).forEach(s -> System.out.println(s.getClass()));
	}


	
}