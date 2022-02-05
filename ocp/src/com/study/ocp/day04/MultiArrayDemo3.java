package com.study.ocp.day04;
import java.util.Arrays;
public class MultiArrayDemo3 {

	public static void main(String[] args) {
		int[][][] scores = {
				{{100, 90, 80}, {70, 60}, {50}},
				{{40, 30}, {20}},
				{{10, 5}}
		};
		// 求總分 = ?
		int total =0;
		for(int[][] s_outter1 : scores) {
			for(int[] s_outter2 : s_outter1) {
				for(int s_inner : s_outter2) {
					total += s_inner;					
				}
			}
		}
		System.out.println(total);
		// java 8 求總分 = ?
		int example1 = Arrays.stream(scores)
				  // 將 3 維陣列 轉成 2 維陣列
			     .flatMapToInt(n1 -> Arrays.stream(n1) //flatMapToInt((int[][] n1) -> Arrays.stream(n1)  						   
			      // 將 2 維陣列 轉成 1 維陣列
			     .flatMapToInt(n2 -> Arrays.stream(n2))) 
			      // 最後將 1 維陣列相加
			     .sum(); 														   
		System.out.println(example1);
		// java 8 求總分 = ?
		int example2 = Arrays.stream(scores)
				  // 將 3 維陣列 轉成 2 維陣列
			     .flatMap(n1 -> Arrays.stream(n1))  						   
			      // 將 2 維陣列 轉成 1 維陣列
			     .flatMapToInt(n2 -> Arrays.stream(n2)) 
			      // 最後將 1 維陣列相加
			     .sum(); 														   
		System.out.println(example2);
	}
}