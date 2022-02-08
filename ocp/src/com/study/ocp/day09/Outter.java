package com.study.ocp.day09;
public class Outter {
	static int sx = 9;
	int x = 7;
	// 一般內部類別
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
	// 靜態內部類別
	static class SInner{
		static void printMe() {
			System.out.println("Print me!");
		}
		void printMe2() {
			System.out.println("Print me2!");
		}
		// 靜態內部類別又有一個靜態類別
		static class Foo{
			static void bar() {
				System.out.println("bar");
			}
		}
	}
	public void foo() {
		Inner in = new Inner();
		in.callMe();
	}
}
