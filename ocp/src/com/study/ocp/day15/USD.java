package com.study.ocp.day15;
public class USD implements Runnable {
	private Box box;
	public USD(Box box) {
		this.box = box;
	}
	@Override
	public void run() {
		double exchange = 28.35;
		System.out.println("USD exchange " + exchange);
		box.setValue(exchange); // 因為無法回傳，所以將 exchange 丟到 setValue 中
	}
}