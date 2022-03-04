package com.study.ocp.day15;
public class StockPrice implements Runnable{
	@Override
	public void run() {
		System.out.println("Start carching stock price of TSMC... Awaiting...");
		try {
			Thread.sleep(3000); // 暫停 3 秒 (模擬執行時間)
		} catch (Exception e) {
			
		}
		System.out.println("Stock price of TSMC: $650");
	}
}
