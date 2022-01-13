package com.study.ocp.day03;

import java.util.Arrays;
import java.util.Scanner;

public class CheckId {
	public static void main(String[] args) {
		System.out.print("請輸入身分證字號: ");
		String id = new Scanner(System.in).next();
		System.out.println(id);
//		String id = "A233344556";
		int[] nums = new int[11];
//		System.out.println(id.charAt(0));
//		int x = id.chatAt(1);
//		System.out.println(id.charAt(1));
//		System.out.println(x - 48);
		for(int i=0; i<id.length(); i++) {
			nums[i+1] = id.charAt(i) - 48;			
		}
		System.out.println(Arrays.toString(nums));
		switch(id.charAt(0)) {
			case 'A':
				nums[0] = 1; nums[1] = 0;
				break;
			case 'F':
				nums[0] = 1; nums[1] = 5;
				break;				
		}
		System.out.println(Arrays.toString(nums));
		// 驗證
		int[] m = {1, 9 ,8 ,7, 6, 5, 4, 3, 2, 1 ,1};
		System.out.println(Arrays.toString(m));
		int sum = 0;
		// nums 與 m 依序相乘
		for(int i=0; i<nums.length; i++) {
			sum += nums[i] * m[i];			
		}
		System.out.println(sum);
		System.out.println(sum % 10 == 0);
	}
}
