package com.set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<>();
		ts.add(4);
		ts.add(6);
		ts.add(3);
		ts.add(5);
		ts.add(1);
		ts.add(2);
		ts.add(8);
		System.out.println(ts);
		
		Iterator<Object> is = ts.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
			}
		System.out.println("!@#$%^&*(!@#$%^&*!@#$%^&*");

		NavigableSet<Object> ds = ts.descendingSet();
		System.out.println(ds);
		for(Object os:ds) {
			System.out.println(os);
		}
		System.out.println("Celing Method : "+ts.ceiling(7));
		System.out.println("Floor method : "+ts.floor(6));
		
	}

}
