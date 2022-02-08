package com.study.ocp.day09;

import com.study.ocp.day09.Outter.SInner;
import com.study.ocp.day09.Outter.SInner.Foo;

public class OuterTest {	
	public static void main(String[] args) {
		Outter ou = new Outter();
		Outter.Inner in = ou.new Inner();
		in.callMe();
		
		Outter outter = new Outter();
		outter.foo();
		//-----------------------------------
		// Java 1.7
		Outter.SInner os = new Outter.SInner();
		os.printMe();
		os.printMe2();
		// Java 1.8 語法允許
		SInner.printMe(); 
		Foo.bar();
	}
}
