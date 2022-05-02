package com.javaex.ex01;

public class PointList {
	private Point[] pArray;
	private int ctrPos;
	
	public PointList() {
		pArray = new Point[3];
		ctrPos = 0;
	}
	
	public void add(Point point) {
		pArray[ctrPos] = point;
		ctrPos++;
	}
	
	public int size() {
		return ctrPos;
	}
	
	public Point get(int index) {
		return pArray[index];
	}
}
