package design_pattern.decorator.sidedish;

import design_pattern.decorator.Food;

public class Olives extends SideDish{

	public Olives(Food food) {
		super(food);	
		name = "橄欖";
		price = 10;
	}
}
