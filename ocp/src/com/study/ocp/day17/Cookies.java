package com.study.ocp.day17;
public class Cookies {
	private boolean empty = true;
	public synchronized void put(int i) {
		String tName = Thread.currentThread().getName();
		if(!empty) { // !empty == false
			try {
				wait();	
			}catch(InterruptedException e) {
				System.out.println(e);
			}			 
		}
		System.out.printf("%s 放了第 %d 餅乾\n", tName, i); // 主人放餅乾
		empty = false; // 餅乾放玩了 
		notify(); // 呼叫小白狗
	}
	
	public synchronized void eat(int i) {
		String tName = Thread.currentThread().getName();
		if(empty) { // empty == true
			try{
				wait();
			} catch(InterruptedException e) {
				System.out.println(e);
			}			
		}
		System.out.printf("%s 吃了第 %d 餅乾\n", tName, i);
		empty = true; // 吃完了
		notify(); // 呼叫主人
	}
}
