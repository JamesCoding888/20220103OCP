package com.study.ocp.day08;

public class Zoo {
	public static void main(String[] args) {
		/*
		Cat c1 = new Tiger();
		c1.move();
		Cat c2 = (Cat)new Tiger();
		c2.move();
		((Cat)new Tiger()).move();
		 */
		
		Animal animal = new Tiger();
		if(animal instanceof Animal) {
			((Cat)animal).move();
		} else {
			System.out.println("轉型失敗");
		}
		if(animal instanceof Fish) { // animal 是否繼承 Fish
			((Fish)animal).move();	
		} else {
			System.out.println("animal 不可轉型成 Fish");
		}				
	}
}
