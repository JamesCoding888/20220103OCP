package com.study.ocp.day07;
import java.util.Arrays;
public class OverLoadingTest {
	
	public int add(int x) {
		return x;
		
	}
	public int add(int x, int y) {
		return x+y;
		
	}
	public int add(int x, int y, int z) {
		return x+y+z;
		
	}
//	public int[] add(int[] x) {
//		return x;
//	}	
	public int add(int... num) { // 由 compiler 產生了一個 int[] num 的陣列
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			sum += num[i];
		}
		return sum;		
	}
	public static void main(String[] args) {
		int num1 = new OverLoadingTest().add(1);
		int num2 = new OverLoadingTest().add(1,2);
		int num3 = new OverLoadingTest().add(1,2,3);
		int[] num4 = {1,2,3,4};
		int num5 = new OverLoadingTest().add(1,2,3,4,5);
		new OverLoadingTest().add(num4);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(Arrays.toString(num4));
		System.out.println("由 compiler 產生了一個 int[] num 的陣列: " + num5);
	}
}
