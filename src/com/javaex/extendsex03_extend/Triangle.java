package com.javaex.extendsex03_extend;

public class Triangle extends Shape {

	private int width;
	private int height;

	public Triangle() {
	}

	public Triangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.print("lineColor = " + lineColor + " ");
		System.out.print(" fillColor = " + fillColor + " ");
		System.out.print(" width = " + width + " ");
		System.out.print(" height = " + height);
		System.out.println(" 삼각형입니다.");
	}
}
