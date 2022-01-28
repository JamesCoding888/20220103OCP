package com.study.ocp.day08_4;
import java.util.Random;
public class Multiton {
	private int num;
	private static Multiton[] list = {
			new Multiton(70000), new Multiton(100), new Multiton(-100)
	};	
	private Multiton(int num) {
		this.num = num;
	}
	public static Multiton getInstance() {
		return list[new Random().nextInt(3)]; // list[0], list[1], list[2]
	}
	public int getNum() {
		return num;
	}
}
