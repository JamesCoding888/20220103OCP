package com.study.ocp.day07.drinkStore;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Stream;
public class DrinkStore {
	public static void main(String[] args) {		
		Drink d1 = new RedTea();
		Drink d2 = new Coffee();
		Drink d3 = new Milk();
		System.out.println(d1.getName());
		System.out.println(d1.getPrice());
		// java 8 stream
		Drink[] drinks = {d1, d2, d3};					
		IntSummaryStatistics stat1 = Stream.of(drinks).mapToInt(Drink::getPrice).summaryStatistics();
		IntSummaryStatistics stat2 = Arrays.stream(drinks).mapToInt(Drink::getPrice).summaryStatistics();
		System.out.printf("stat1 -> 總價: %,d 均價: %.1f\n", stat1.getSum(), stat1.getAverage());
		System.out.printf("stat2 -> 總價: %,d 均價: %.1f\n", stat2.getSum(), stat2.getAverage());
		DrinkService service = new DrinkService();
		service.print(d3);
		Stream.of(drinks).forEach(d -> service.print(d));		
		// 兌換
		Optional<Drink> optDrink = service.getRandomDrink();
		if(optDrink.isPresent()) {
			Drink drink = optDrink.get();
			System.out.println(drink.getName());
		} else {
			System.out.println("銘謝惠顧");
		}		
	}
}
