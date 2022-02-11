package design_pattern.decorator;

import design_pattern.decorator.sidedish.Egg;
import design_pattern.decorator.sidedish.Ham;
import design_pattern.decorator.sidedish.Lettuce;
import design_pattern.decorator.sidedish.Olives;
import design_pattern.decorator.sidedish.Onion;
import design_pattern.decorator.sidedish.Tomato;
import design_pattern.decorator.sidedish.Tuna;

public class Subway{
	public static void main(String[] args) {
		Food food = new Bread();
		food = new Ham(food);
		food = new Lettuce(food);
		food = new Olives(food);
		food = new Tomato(food);
		food = new Tuna(food);
		food = new Onion(food);
		food = new Onion(food);
		food = new Egg(food);
		food = new Egg(food);
		food = new Egg(food);
		food = new Egg(food);
		
		System.out.println(food.getName());
		System.out.println(food.getPrice());
	}
}
