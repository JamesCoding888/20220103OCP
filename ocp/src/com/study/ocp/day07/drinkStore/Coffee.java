package com.study.ocp.day07.drinkStore;

public class Coffee implements Drink{
	String name = "Coffee";
	Integer price = 75;
	@Override
	public String getName() {
		name = this.name;
		return name;
	}

	@Override
	public Integer getPrice() {
		price = this.price;
		return price;
	}
	
}
