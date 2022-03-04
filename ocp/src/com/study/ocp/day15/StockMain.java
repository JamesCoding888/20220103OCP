package com.study.ocp.day15;
public class StockMain {
	public static void main(String[] args) {
		Runnable information1 = new StockPrice();
		Runnable information2 = new StockNews();
		Thread t1 = new Thread(information1);
		Thread t2 = new Thread(information2);
		t1.start();
		t2.start();
	}
}
