package design_pattern.decorator.sidedish;

import design_pattern.decorator.Food;

public class Egg extends SideDish{
	
	public Egg(Food food) {
		super(food);
		name = "火腿";
		price = 10;
	}

}
