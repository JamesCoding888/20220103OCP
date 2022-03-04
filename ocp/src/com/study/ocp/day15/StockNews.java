package com.study.ocp.day15;
public class StockNews implements Runnable{
	@Override
	public void run() {
		System.out.println("Start carching stock price of TSMC... Awaiting...");
		try {			
			Thread.sleep(1000);
			System.out.println("News of TSCM 1");
			Thread.sleep(1000);
			System.out.println("News of TSCM 2");
			Thread.sleep(1000);
			System.out.println("News of TSCM 3");
		} catch (Exception e) {	}
		System.out.println("News of TSMC, Ending");
	}
}
