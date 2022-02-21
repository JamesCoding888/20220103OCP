package com.study.ocp.day12;
public class Fruit {
	private String name;
	private Integer qty;
	private Integer price;
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, Integer qty, Integer price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}	
}
