package com.study.ocp.day07.drinkStore;

public class Milk implements Drink{
	String name = "Milk";
	Integer price =40;
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
