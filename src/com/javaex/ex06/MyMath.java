package com.javaex.ex06;

public class MyMath {

	
	private static final double pi = 3.14;
	
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static double plus(double a, double b) {
		return a+b;
	}
	
	public static double area(double radius) {
		return radius*radius*pi;
	}
}
