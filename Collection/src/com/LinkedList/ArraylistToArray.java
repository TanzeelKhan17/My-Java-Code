package com.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistToArray {
public static void main(String[] args) {
	String [] a= {"Zaid","Tyao","Junaid","Kashif"};
	ArrayList<String> l =new ArrayList<>();
	for(String s:a) {
		l.add(s);
		}
	System.out.println("Array to Array List");
	System.out.println(l);//Array to Array List
	
	System.out.println("Array list To Array");
	String [] b=new String[l.size()];
	for(int i=0;i<b.length;i++) {
		b[i]=l.get(i);
		
	}
	for(String c:b) {
		System.out.println(c);
	}
	
	
}
}
