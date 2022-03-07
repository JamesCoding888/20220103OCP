package com.study.ocp.day16;
public class ATM {
	public static void main(String[] args) {
		Account account = new Account(10_000); 		
		System.out.printf("帳戶餘額 $%,d\n", account.getBalance());
		System.out.println("提款...");
		Thread t1 = new Thread(new Withdraw(account, 5_000), "小名"); // 小名要去提款 $5000
		Thread t2 = new Thread(new Withdraw(account, 4_000), "小華"); // 小華要去提款 $4000
		Thread t3 = new Thread(new Withdraw(account, 3_000), "小英"); // 小英要去提款 $3000
		// 開始提款作業
//		/* 1. start() 會有問題，每人盡情提款
		t1.start();
		t2.start();
		t3.start();
//		*/
		/* 2. run() 正確 
		t1.run();
		t2.run();
		t3.run();
		*/
		
		StringBuilder s1; // Non-Thread-Safe (單工用, 只用在某一方法中)
		StringBuffer s2; // Thread-Safe (多執行續用, 建立物件變數)
	}
}
