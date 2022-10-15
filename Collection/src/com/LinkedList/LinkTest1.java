package com.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkTest1 {
	public static void main(String[] args) {
		Object obj[]=new Object[1000000];
		for(int i=0;i<obj.length;i++) {
			obj[i]=new Object();//creating new object with index
			//System.out.println(obj[i]);
		}
		long start=System.currentTimeMillis();
		List<Object>t1=new LinkedList<>();
		t1.add("tyao");
		t1.add("tanzeel");
		t1.add("junaid");
		System.out.println(t1);
		t1.remove(2);
		System.out.println(t1);
		long end=System.currentTimeMillis();
		System.out.println("Time Taken : "+(end-start));
		List<Object>t2=new ArrayList<>();

		t2.add("tanzeel");
		t2.add('c');
		t2.add(123);
		t2.add(4);
		t2.add(5);

		
		System.out.println(t2);
		t2.add(3, "tyao");
		System.out.println(t2);
		t2.set(3, "junaid");
		System.out.println(t2);
		t2.addAll(t1);
		System.out.println(t2);

		for(Object tyao:obj) {
			t2.add(obj);
			
		}
		System.out.println(t1.get(1)==t2.get(0));

		
	}

}
