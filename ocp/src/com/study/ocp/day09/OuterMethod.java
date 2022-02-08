package com.study.ocp.day09;

public class OuterMethod {
	public void bar(int y) { // y 也是區域變數
//		y++;
		// 區域變數
		int x = 10; // final int x = 10
//		x = 30;
		class Inner{
			void callMe() {
				System.out.println("Call me");
				System.out.println(x);
				//since y was used by inner class, 
				//then local variable "int y" would be "final int y"
				System.out.println(y);
			}
		}
		Inner in = new Inner();
		in.callMe();
	}
}
