package com.javaex.extendsex03_extend;

public class ShapeApp {

	public static void main(String[] args) {

		Shape[] sArray = new Shape[2];

		Shape s1 = new Rectangle("red", "red", 3, 3);
		Shape s2 = new Triangle("green", "green", 2, 2);	// 섞어쓰기.

//		Triangle t1 = new Triangle("red", "red", 10, 10);
//		Triangle t2 = new Triangle("blue", "blue", 15, 15);
//		Triangle t3 = new Triangle("green", "green", 22, 22);

		sArray[0] = s1;
		sArray[1] = s2;

		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
		}
		
	}

}
