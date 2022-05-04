package com.javaex.ex04;
import java.util.*;

public class MyListApp {
	public static void main(String[] args) {
		
		LinkedList<Point> pList = new LinkedList<>();
		
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);
		Point p03 = new Point(113,115);
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("==============================");
		
		// pList.remove(1);
		pList.remove(p02);
			
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("==============================");
		
		System.out.println(pList.toString());
		
		System.out.println("==============================");
		
		for(Point p :pList) {
			System.out.println(p.toString());
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		
		System.out.println("==============================");
		
		pList.add(1, p02);
		
		System.out.println(pList.toString());
	}
}

