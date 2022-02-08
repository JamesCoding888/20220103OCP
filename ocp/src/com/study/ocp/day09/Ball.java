package com.study.ocp.day09;

import java.util.Objects;

public class Ball {
	private String color;
	private int price;
	
	public Ball() {
		
	}

	public Ball(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		Ball b2 = (Ball)obj;
		if(b2.price == this.price && 
				b2.color == this.color) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 7;
	}
	*/
	
	
	@Override
	public String toString() {
		return "Ball [color=" + color + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ball other = (Ball) obj;
		return Objects.equals(color, other.color) && price == other.price;
	}
}
