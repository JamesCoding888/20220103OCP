package com.study.ocp.day09;
public class AddCalc implements Calc {
	@Override
	public int Computer(int x, int y) {
		return x + y;
	}
}
