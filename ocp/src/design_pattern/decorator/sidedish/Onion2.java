package design_pattern.decorator.sidedish;

import design_pattern.decorator.Food;

public class Onion2 extends SideDish{

	public Onion2(Food food) {
		super(food);	
		name = "洋蔥";
		price = 7;
	}
}
