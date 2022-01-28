package com.study.ocp.day08_4;
import java.util.Random;
public class SingleTon {
	private int num;
	private static SingleTon instance = new SingleTon(); // 自己 new 自己 並放入 private static 方法中 
	private SingleTon() { // private 建構子
		num = new Random().nextInt(1000);
	}
	public static SingleTon getInstance() {
		return instance;
	}
	public int getNum() {
		return num;
	}
}
