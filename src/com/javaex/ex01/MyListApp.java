package com.javaex.ex01;

public class MyListApp {
	public static void main(String[] args) {
		
		/*
		 * Point[] pArray = new Point[100]; //갯수 미리 정해야 한다
		 * 
		 * Point p00 = new Point(2,2); Point p01 = new Point(12,13); Point p02 = new
		 * Point(22,23);
		 * 
		 * pArray[0] = p00; pArray[1] = p01; pArray[2] = p02;
		 * 
		 * for(int i=0; i<pArray.length; i++) {
		 * System.out.println(pArray[i].toString()); }
		 */
		
		PointList pList = new PointList();
		
		Point p01 = new Point(2,3);
		Point p02 = new Point(12,13);
		
		pList.add(p01);
		pList.add(p02);
		
		Point p = pList.get(1);
		
		System.out.println(pList.size());
		System.out.println(p.getY());
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(19);
		
		CircleList cList = new CircleList();
		
		cList.add(c01);
		cList.add(c02);
		
		Circle c = cList.get(0);
		System.out.println(c.getRadius());
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
	}
}
