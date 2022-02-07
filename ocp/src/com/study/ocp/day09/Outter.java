package com.study.ocp.day09;
public class Outter {
	static int sx = 9;
	int x = 7;
	class Inner {
		int x = 77;
		void callMe() {
			int x = 777;
			System.out.println("Call me!");
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outter.this.x);
			System.out.println(Outter.sx);
		}	
	}
	public void foo() {
		Inner in = new Inner();
		in.callMe();
	}
}
