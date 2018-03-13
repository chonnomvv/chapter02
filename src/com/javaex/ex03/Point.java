package com.javaex.ex03;

public class Point {
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점 [ x = "+ this.x + ", y = " + this.y + "] 를 그렸습니다.");
	}
	
	public void draw(int x, int y) {
		System.out.println("점 [ x = "+ this.x + ", y = " + this.y + "] 뺴앵애애ㅐ애애애애애애애애애애애애액");
	}

}
