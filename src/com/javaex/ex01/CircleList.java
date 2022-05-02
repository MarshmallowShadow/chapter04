package com.javaex.ex01;

public class CircleList {
	private Circle[] cArray;
	private int ctrPos;
	
	public CircleList() {
		cArray = new Circle[3];
		ctrPos = 0;
	}
	
	public void add(Circle circle) {
		cArray[ctrPos] = circle;
		ctrPos++;
	}
	
	public int size() {
		return ctrPos;
	}
	
	public Circle get(int index) {
		return cArray[index];
	}
}
