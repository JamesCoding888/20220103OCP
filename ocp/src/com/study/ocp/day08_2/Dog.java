package com.study.ocp.day08_2;
/*
interface
	1. 沒有建構子
	2. public abstract 可省略 

*/

public interface Dog{
	public static final String ID_NUMBER = "A126478778";
	public abstract void eat();
	public abstract void skill();
	public default void action() {
		System.out.println(ID_NUMBER);
	}
}
