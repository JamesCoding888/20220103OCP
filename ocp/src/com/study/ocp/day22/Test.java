package com.study.ocp.day22;

interface Foo{
	void eat();
}
public class Test {

	public static void main(String[] args) {
		Foo foo = new Foo() {
			@Override
			public void eat() {
				System.out.println("eat");
			}
		};
		
		
	}
	
}
