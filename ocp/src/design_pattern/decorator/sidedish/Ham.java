package design_pattern.decorator.sidedish;

import design_pattern.decorator.Food;

public class Ham extends SideDish{

	public Ham(Food food) {
		super(food);	
		name = "火腿"; // 使用 Food 的 field
		price = 30;
	}
	
}
