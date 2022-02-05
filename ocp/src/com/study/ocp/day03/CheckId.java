/********************************************
 * 此程式不可用於任何非法行為，否則後果自行負責!!!
*********************************************/
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
		switch (id.charAt(0)) {
			case 'A': // 台北市
				nums[0] = 1;
				nums[1] = 0;
				break;
			case 'B': // 台中市
				nums[0] = 1;
				nums[1] = 1;
				break;
			case 'C': // 基隆市
				nums[0] = 1;
				nums[1] = 2;
				break;
			case 'D': // 台南市
				nums[0] = 1;
				nums[1] = 3;
				break;
			case 'E': // 高雄市
				nums[0] = 1;
				nums[1] = 4;
				break;
			case 'F': // 新北市
				nums[0] = 1;
				nums[1] = 5;
				break;
			case 'G': // 宜蘭縣
				nums[0] = 1;
				nums[1] = 6;
				break;
			case 'H': // 台中市
				nums[0] = 1;
				nums[1] = 7;
				break;
			case 'I': // 嘉義市
				nums[0] = 3;
				nums[1] = 4;
				break;
			case 'J': // 新竹縣
				nums[0] = 1;
				nums[1] = 8;
				break;
			case 'K': // 苗栗縣
				nums[0] = 1;
				nums[1] = 9;
				break;
			case 'M': // 南投縣
				nums[0] = 2;
				nums[1] = 1;
				break;
			case 'N': // 彰化縣
				nums[0] = 2;
				nums[1] = 2;
				break;
			case 'O': // 新竹市
				nums[0] = 3;
				nums[1] = 5;
				break;
			case 'P': // 雲林縣
				nums[0] = 2;
				nums[1] = 3;
				break;
			case 'Q': // 嘉義縣
				nums[0] = 2;
				nums[1] = 4;
				break;
			case 'T': // 屏東縣
				nums[0] = 2;
				nums[1] = 7;
				break;
			case 'U': // 花連線
				nums[0] = 2;
				nums[1] = 8;
				break;
			case 'V': // 台東縣
				nums[0] = 2;
				nums[1] = 9;
				break;
			case 'W': // 金門縣
				nums[0] = 3;
				nums[1] = 2;
				break;
			case 'X': // 澎湖縣
				nums[0] = 3;
				nums[1] = 0;
				break;
			case 'Z': // 連江縣
				nums[0] = 3;
				nums[1] = 3;
				break;
			case 'L': // 台中縣
				nums[0] = 2;
				nums[1] = 0;
				break;
			case 'R': // 台南縣
				nums[0] = 2;
				nums[1] = 5;
				break;
			case 'S': // 高雄縣
				nums[0] = 2;
				nums[1] = 6;
				break;
			case 'Y': // 陽明山管理局
				nums[0] = 3;
				nums[1] = 1;
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
