package com.study.ocp.day18;

import java.util.Random;

public class Lotto implements Runnable{

	
	@Override
	public void run() {
		Random random = new Random();
		try {
			Thread.sleep(random.nextInt(5000));	
		} catch (Exception e) {
			
		}
		int n = random.nextInt(100);
		String tName = Thread.currentThread().getName();
		System.out.printf("%s -> %d\n", tName, n);	
		
		
	}

	
}
