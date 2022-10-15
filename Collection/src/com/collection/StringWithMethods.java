package com.collection;

import java.util.ArrayList;
import java.util.List;

public class StringWithMethods {
	public static void main(String[] args) {
		ArrayList<String>s1=new ArrayList<>();
		s1.add("Tanzeel");		
		s1.add("Tyao");		
		s1.add("Junaid");		
		s1.add("Kashif");	
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		ArrayList<String>s2=new ArrayList<>();
		s2.add("Tanzeel");
		s2.add("Tyao");
		s2.add("Junaid");
		s2.add("Kashif");
	s1.addAll(2,s2);
	System.out.println(s1);
	s1.add(5,"Zaid");
	System.out.println(s1);
	s1.set(2, "Gufran Bhai");
	System.out.println(s1);
	if(s1.contains("Zaidgg"))
	{
		System.out.println("  present in s1");
	}
	else if(s2.contains("Abdul")) {
		System.out.println(" present in s2");
	}
	else {
		System.out.println("Do not present in Both");
	}
	
	
	
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}

}
