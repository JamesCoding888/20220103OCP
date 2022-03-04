package com.study.ocp.day13;
import java.util.Arrays; 
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputData2 {
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

		catch(InputMismatchException e1) {
			System.out.println("其他錯誤:" + e1);
			System.out.println("錯誤內容:" + e1.getMessage());
		} 
		
		catch (ArrayIndexOutOfBoundsException e2) { 
			System.out.println("其他錯誤:" + e2);
			System.out.println("錯誤內容:" + e2.getMessage());
		} 
		
		catch (ArithmeticException e3) {
			System.out.println("其他錯誤:" + e3);
			System.out.println("錯誤內容:" + e3.getMessage());
		} 

		catch(Exception e4){
			System.out.println("其他錯誤:" + e4);
			System.out.println("錯誤內容:" + e4.getMessage());
		}
		System.out.println("end.");
	}
}
