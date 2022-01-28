package com.study.ocp.day08_2;

import java.util.stream.Stream;

public class PetStore{
	public static void main(String[] args) {
//		Dog d1 = new Shiba();
//		Dog d2 = new Chihuahua();
		Dog[] dogs = {new Shiba(), new Chihuahua(), new EDog() };
		Stream.of(dogs).forEach(System.out::print);
		Stream.of(dogs).forEach(PetStore::print);
	}	
	
	public static void print(Dog dog) {
		System.out.println(dog.getClass().getSimpleName()); // 得到 dog 物件中有喇些 method
		dog.eat();
		dog.skill();
	}
}
