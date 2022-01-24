package com.study.ocp.day07.drinkStore;

public class RedTea implements Drink{

	String name = "RedTea";
	Integer price = 20;
	
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
