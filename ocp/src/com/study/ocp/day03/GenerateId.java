/********************************************
 * 此程式不可用於任何非法行為，否則後果自行負責!!!
*********************************************/
package com.study.ocp.day03;
import java.util.Random;
import java.util.Scanner;
// 身分證字號產生器
public class GenerateId {
	public static boolean checkId(String id) {
		int[] nums = new int[11];
		for (int i = 1; i < id.length(); i++) {
			nums[i + 1] = id.charAt(i) - 48;
		}
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
		// 驗證
		int[] m = { 1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1 };
		int sum = 0;
		// nums 與 m 依序相乘
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i] * m[i];
		}
		return sum % 10 == 0; // 整除餘 0 表示身分證號碼正確
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入需要產生幾筆的身分證字號: ");
		int quantity = scanner.nextInt();
//		System.out.println(quantity);
		Random r = new Random();
		Random locationNumber = new Random();
		int count = 0; // 累加次數
		while (quantity != count) { // number 是 id 的第一個位置的字母(A~Z)來決定要產生哪一縣市的ID
			int number = locationNumber.nextInt(100);
			while ((number >= 65 && number <= 90) ? true : false) {
				char num = (char) number;
				String id = String.valueOf(num) + (r.nextInt(2) + 1) + r.nextInt(10) + r.nextInt(10) + r.nextInt(10)
						+ r.nextInt(10) + r.nextInt(10) + r.nextInt(10) + r.nextInt(10) + r.nextInt(10);
				if (checkId(id)) {
					count+= 1;
					System.out.println(id);
					break;
				}
			}
		}
	}
}

