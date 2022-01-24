package com.study.ocp.day07.drinkStore;
import java.util.Optional;
import java.util.Random;
//飲料服務
public class DrinkService {
	// 印出飲料資料
	public void print(Drink drink) {
		System.out.printf("飲料名: %s 價格: %d\n", drink.getName(), drink.getPrice());
	}
	// randomly 兌換飲料一杯
	public Optional<Drink> getRandomDrink() {
		Random r = new Random();
		//Optional.of(null) -> 不可以放入 null
		//ofNullable(null) -> 可以放入 null
		Optional<Drink> drink = Optional.ofNullable(null); 
		switch(r.nextInt(6)) { // 亂數產生 0, 1, 2, 3, 4, 5
			case 0:  // case 0 ~ case 3 加權 RedTea 抽到的機率
			case 1:
			case 2:
			case 3:
				drink = Optional.of(new RedTea());
				break;
			case 4:
				drink = Optional.of(new Coffee());
				break;			
			case 5:
				drink = Optional.of(new Milk());
				break;		
		}
		return drink;
	}
}
