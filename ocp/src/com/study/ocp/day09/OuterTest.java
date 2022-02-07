package com.study.ocp.day09;
public class OuterTest {	
	public static void main(String[] args) {
		Outter ou = new Outter();
		Outter.Inner in = ou.new Inner();
		in.callMe();
		
		Outter outter = new Outter();
		outter.foo();
	}
}
