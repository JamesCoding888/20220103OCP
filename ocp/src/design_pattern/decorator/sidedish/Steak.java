package design_pattern.decorator.sidedish;

import design_pattern.decorator.Food;

public class Steak extends SideDish{

	public Steak(Food food) {
		super(food);	
		name = "牛排";
		price = 88;	
	}
}
