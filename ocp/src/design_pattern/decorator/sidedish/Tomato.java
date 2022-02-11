package design_pattern.decorator.sidedish;

import design_pattern.decorator.Food;

public class Tomato extends SideDish{

	public Tomato(Food food) {
		super(food);	
		name = "蕃茄";
		price = 12;
	}
}
