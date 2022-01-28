package com.study.ocp.day08_4;
import java.util.stream.Stream;
public class MultitonTest {
	public static void main(String[] args) {
		Multiton[] multitons = {
				Multiton.getInstance(),
				Multiton.getInstance(),
				Multiton.getInstance(),
				Multiton.getInstance(),
				Multiton.getInstance()
		};
		Stream.of(multitons).forEach(m -> System.out.println(m.getNum()));
	}
}
