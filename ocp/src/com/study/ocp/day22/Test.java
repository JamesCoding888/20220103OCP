package com.study.ocp.day22;

interface Foo_1{
	void eat();
}
public class Test {

	public static void main(String[] args) {
		Foo_1 foo = new Foo_1() {
			@Override
			public void eat() {
				System.out.println("eat");
			}
			public void play() {
				System.out.println("play");
			}
		};
		foo.eat();
		((Test$1)foo_1).play(); // JRE 1.5 可以執行，但之後就不行了
		
	}
	
}
