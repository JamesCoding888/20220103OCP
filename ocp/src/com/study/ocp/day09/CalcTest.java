package com.study.ocp.day09;
public class CalcTest {
	public static void main(String[] args) {
		Calc calc = new AddCalc();
		System.out.println(calc.Computer(10, 20));
		Calc calc2 = new Calc() { // 只限 functionalInterface
			@Override
			public int Computer(int x, int y){
				return x + y;
			}
		};
		System.out.println(calc2.Computer(10, 20));
		// Java 8 Lambda
		Calc calc3 =  (int x, int y) -> x + y;
		System.out.println(calc3.Computer(10, 20));
		// Java 8 Lambda		
		Calc calc4 =  (x, y) -> x + y;
		System.out.println(calc4.Computer(10, 20));
	}
}
