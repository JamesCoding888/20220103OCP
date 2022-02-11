package design_pattern.decorator.sidedish;

import design_pattern.decorator.Food;

public class Lettuce extends SideDish{

	public Lettuce(Food food) {
		super(food);	
		name = "生菜";
		price = 15;
	}	
}
