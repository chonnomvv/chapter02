package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		Goods noteBook = new Goods();
		Goods cup = new Goods();
		Goods pen = new Goods("Pencil", 1000);
		Goods pen2 = new Goods(9000);
		
		pen.showInfo();
		pen2.showInfo();
		
		noteBook.setName("LG_gram");
		noteBook.setPrice(910000);
		
//		System.out.println("상품명: " + noteBook.getName());
//		System.out.println("상품가격: " +noteBook.getPrice());
		
		cup.setName("Mug Cup");
		cup.setPrice(2000);
		
		noteBook.showInfo();
		cup.showInfo();
		
		
//		System.out.println(cup.getName());
//		System.out.println(cup.getPrice());
		
		
		/*noteBook.name = "LG gram";
		noteBook.price = 900000;
		
		cup.name = "Mug cup";
		cup.price = 2000;
		
		System.out.println(noteBook.name);
		System.out.println(noteBook.price);
		
		System.out.println(cup.name);
		System.out.println(cup.price);*/
	}

}