package com.study.ocp.day03;
import java.util.Arrays;
public class ArrayCopy {
	public static void main(String[] args) {
		int[] num1 = {100, 90, 80};
		System.out.println(Arrays.toString(num1));
		// 指派
		int[] num2 = num1;
		System.out.println(Arrays.toString(num2));
		// Arrays.copyof()
		int[] num3 = Arrays.copyOf(num1, num1.length);
		System.out.println(Arrays.toString(num3));
		// System.arraycopy(src, srcPos, dest, destPos, length) 考 !!
		int[] num4 = new int[10];
		System.arraycopy(num1, 0, num4, 1, num1.length);
		System.out.println(Arrays.toString(num4));
		// clone()
		int[] num5 = num1.clone();
		System.out.println(Arrays.toString(num5));
	}
}
