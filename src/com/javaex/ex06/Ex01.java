package com.javaex.ex06;
import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		
		for(Integer i: lotto) {
			System.out.print(i + " ");
		}
	}
}
