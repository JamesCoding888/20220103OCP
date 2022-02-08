package com.study.ocp.day09;
// PENNY = 1, NUCKLE = 5, DIME = 10, QUARTER = 25
public enum USCurrency{
	PENNY(1),
	NICKLE(5),
	DIME(10),
	QUARTER(25);
	private int value;
	private USCurrency(int value) { // 建構子不可public
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
