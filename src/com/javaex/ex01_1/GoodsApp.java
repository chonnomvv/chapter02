package com.javaex.ex01_1;

public class GoodsApp {

	public static void main(String[] args) {
		// 
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.getCount());
		System.out.println(camera.getName());
		System.out.println(camera.getPrice());
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.getCount());
		System.out.println(cup.getName());
		System.out.println(cup.getPrice());
	}

}
