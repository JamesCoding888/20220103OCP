package design_pattern.decorator.sidedish;

import design_pattern.decorator.Food;

public class Tuna extends SideDish{

	public Tuna(Food food) {
		super(food);	
		name = "鮪魚";
		price = 26;
	}
}
