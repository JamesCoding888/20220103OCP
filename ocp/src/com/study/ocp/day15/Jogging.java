package com.study.ocp.day15;

public class Jogging implements Runnable{

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		for(int i = 1; i <= 1000 ; i++) {
//			System.out.printf("%s 跑了 %d 步\n", tName, i);
			System.out.println(tName +" jogging " + i + " step(s)");
		}	
	}
}