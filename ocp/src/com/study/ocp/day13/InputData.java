package com.study.ocp.day13;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputData {

	public static void main(String[] args) {
		int[] data = {10,  5, 2, 0};
		int x = 10; // 分子
		System.out.print("分子 " + x + " / 分母 " + Arrays.toString(data) + " 中選一個, 請輸入 index = " );
		Scanner sc = new Scanner(System.in);
		try {
			int index = sc.nextInt();
			int result = x / data[index];
			System.out.println(result);
		} 
		/* 當初學者還不曉得應用哪一種 Exception 的時候! 該如何做
		catch(InputMismatchException e) {
			
		} 
		
		catch (ArrayIndexOutOfBoundsException e) { 
			
		} 
		
		catch (ArithmeticException e) {

		} 
		*/
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("end.");
	}
}
