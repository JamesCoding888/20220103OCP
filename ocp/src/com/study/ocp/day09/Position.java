package com.study.ocp.day09;
public enum Position {
	一般員工, 經理, 副總, 總經理;
	private Position(){ // private 可寫可不寫，但 compiler 後一定是 private，因為不能讓您 new
		System.out.println("建構 Position");
	}
}
