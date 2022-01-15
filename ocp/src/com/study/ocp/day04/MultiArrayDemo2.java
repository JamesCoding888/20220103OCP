package com.study.ocp.day04;

import java.util.Arrays;

public class MultiArrayDemo2 {

	public static void main(String[] args) {
		int[][] scores = {
				{100, 90, 80},
				{70, 60}
		};
		// 1. 求總分 = ?
		int example1 = scores[0][0] + scores[0][1] + scores[0][2] +
					 scores[1][0] + scores[1][1];
		System.out.printf("總分: %d\n", example1);
		// 2. 求總分 = ?
		int example2 = 0;
		for(int i=0;i<scores.length;i++) {
			for(int k=0;k<scores[i].length;k++) {
				example2 += scores[i][k];
			}
		}
		System.out.printf("總分: %d\n", example2);
		// 3. 求總分 = ?		
		int total = 0;
		for(int[] s_outter : scores) {
			for(int s_inner: s_outter) {	
				total = total + s_inner;					
			}			
		}
		System.out.printf("總分: %d\n", total);
		// 4. 求總分 = ?
		int example4 = Arrays.stream(scores)
						     .map(n -> Arrays.stream(n))
						     .mapToInt(e -> e.sum())
						     .sum();
		System.out.printf("總分: %d\n", example4);
		// 5. 求總分 = ?
		int example5 = Arrays.stream(scores)
						     .flatMapToInt(n -> Arrays.stream(n))
						     .sum();
		System.out.printf("總分: %d\n", example5);
		
	}

}
