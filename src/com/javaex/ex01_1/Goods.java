package com.javaex.ex01_1;

public class Goods {

	private static String name = "";
	private static int price;
	private static int count = 0;
	
	public Goods(String name, int price) {
	
		this.name += name;
		this.price += price;
		pluscount();
	}
	
	public int getCount() {
		return count;
	}
	
	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Goods.price = price;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void pluscount() {
		count ++;
	}
	
	
}
