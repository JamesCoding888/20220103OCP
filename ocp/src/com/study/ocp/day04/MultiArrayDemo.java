package com.study.ocp.day04;

public class MultiArrayDemo {

	public static void main(String[] args) {
		char[][] game = {
				{'O', 'X', 'O'},
				{' ', 'X', 'X'},
				{'O', ' ', 'O'},
		};
		System.out.println(game);
		System.out.println(game[0]);
		System.out.println(game[1]);
		System.out.println(game[2]);
		// 如何讓 X 獲勝 ?
		game[2][1] = 'X';
		System.out.println(game[0]);
		System.out.println(game[1]);
		System.out.println(game[2]);
		// 
		for(char[] c_outter : game) {
			for(char c_inner : c_outter) {
				System.out.print(c_inner + " ");
				
			}
			System.out.println();
		}
	}

}
