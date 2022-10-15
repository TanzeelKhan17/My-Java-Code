package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedlist {

	public static void main(String[] args) {
	
		LinkedHashSet<Object> hs=new LinkedHashSet<>();
       hs.add("Zaid");
       hs.add("Tyao");
       hs.add("Tanzeel");
       hs.add("Kashif");
       hs.add("Ajaz");
       hs.add("Kashif");
       hs.add("Ajaz");
       hs.add("Ajaz");
       hs.add(1);
       hs.add(2);
       hs.add(4);
       hs.add(5);
       hs.add(4);
       
       System.out.println(hs);
       Iterator<Object> is = hs.iterator();
       while(is.hasNext()){
       System.out.println(is.next());
       }
       
       
       
		
	}
	
	
	
	
}
