package com.javaex.ex03;

public class MyListApp {
	public static void main(String[] args) {
		MyList<Point> pList = new MyList<>();
		
		Point p01 = new Point(2,3);
		Point p02 = new Point(12,13);
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.size());
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(((Point) pList.get(i)).getX());
			System.out.println(((Point) pList.get(i)).getY());
			System.out.println(pList.get(i).toString());
		}
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(19);
		
		MyList<Circle> cList = new MyList<>();
		
		cList.add(c01);
		cList.add(c02);
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(((Circle) cList.get(i)).getRadius());
			System.out.println(cList.get(i).toString());
		}
		
	}
}
