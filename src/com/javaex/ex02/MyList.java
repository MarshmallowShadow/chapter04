package com.javaex.ex02;

public class MyList<T> {
	public T[] oArray;
	private int ctrPos;
	
	public MyList() {
		oArray = (T[])new Object[5];
		ctrPos = 0;
	}
	
	public void add(T obj) {
		oArray[ctrPos] = obj;
		ctrPos++;
	}
	
	public int size() {
		return ctrPos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
}
