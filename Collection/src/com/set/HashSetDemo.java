package com.set;

import java.util.HashSet;
import java.util.Random;

public class HashSetDemo {
	public static void main(String[] args) {
		Random r =new Random();
		HashSet<Integer> h = new HashSet<>();
		h.add(11);
		
		for(int i=0;i<=10;i++) {
			int a=r.nextInt(10);
			h.add(a);
			System.out.print(a+",");
		}
		System.out.println();
		System.out.println(h);
		
		
		
	}
    
}
