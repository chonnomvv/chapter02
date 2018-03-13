package com.javaex.ex03;

import java.util.Scanner;

public class PointApp extends Point {

	public static void main(String[] args) {
		
		Point point = new Point();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값을 입력하세요: ");
		point.setX(sc.nextInt());
		
		System.out.print("y값을 입력하세요: ");
		point.setY(sc.nextInt());

		point.draw();
		point.draw(10,20);
		
		
		sc.close();
	}

}
