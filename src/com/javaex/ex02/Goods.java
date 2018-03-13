package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;
	
	public Goods() {}
	
	public Goods(String name) {
		this.name = name;
	}
	
	public Goods(int price) {
		this.price = price;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//name에 상품명을 넣어준다.
	public void setName(String name) {
		this.name = name;
	}
	
	public int setPrice(int i) {
		return price = i;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("==============");	
	}
	
	
	
}
