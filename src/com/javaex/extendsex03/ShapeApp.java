package com.javaex.extendsex03;

public class ShapeApp {

	public static void main(String[] args) {

		Triangle[] tArray = new Triangle[3];
		Rectangle[] rArray = new Rectangle[3];

		Triangle t1 = new Triangle("red", "red", 3, 3);
		Triangle t2 = new Triangle("blue", "blue", 5, 5);
		Triangle t3 = new Triangle("blue", "blue", 5, 5);

		Rectangle r1 = new Rectangle("red", "red", 3, 3);
		Rectangle r2 = new Rectangle("blue", "blue", 5, 5);
		Rectangle r3 = new Rectangle("blue", "blue", 5, 5);

		tArray[0] = t1;
		tArray[1] = t2;
		tArray[2] = t3;

		rArray[0] = r1;
		rArray[1] = r2;
		rArray[2] = r3;

		for (int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}
		System.out.println("---");
		
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		
	}

}
