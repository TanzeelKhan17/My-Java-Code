package com.LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedTest2 {
	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<>();
		L.add("Tanzeel");
		L.add("Kashif");
		L.add("Tyao");
		L.add("Tanzeel");
		L.add("Tyao");
		System.out.println(L);
		L.remove();
		System.out.println(L);
		L.addFirst("Junaid");
		System.out.println(L);
		L.addLast("Beta");
		System.out.println(L);
		System.out.println(L.lastIndexOf("Tyao"));
	System.out.println(	L.indexOf("Tanzeel"));
	//L.getFirst();
	System.out.println(L.getFirst());
	System.out.println(L.getLast());
	System.out.println(L.get(2));
	System.out.println(L.element());
	
	ArrayList<Integer>ar=new ArrayList<>();
	ar.add(30);
	ar.add(20);
	ar.add(50);
	ar.add(40);
	ar.add(10);
	Collections.sort(ar);
	System.out.println(ar);
	for(Integer i:ar) {
		System.out.println(i);
	}
	
	
	
	
	
		
		
	}

}
