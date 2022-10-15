package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		
		List<Integer> tyao=new ArrayList<>();
		
		for(int i=5;i<=50;i=i+15) {
			tyao.add(i);
			
		}
		System.out.println(" List: "+tyao);
		
		tyao.add(3,100);//over loaded paramitrised
		System.out.println("List of index 3 will be: "+tyao);
		
		tyao.set(1, 300);//replacing the value of index
		System.out.println("Replace the value on index 1: "+tyao);
		
		List<Integer> junaid=new ArrayList<>();
		for(int i=100;i<=1000;i=i+100) {
			junaid.add(i);
			
		}
		System.out.println("Second List : "+junaid);
		
		tyao.addAll(2,junaid);
		System.out.println("Add all list : "+tyao);
		
		if(tyao.contains(501)) {
			System.out.println("tyao has the value");}
			else if(junaid.contains(50)) {
				System.out.println("junaid has the value");
			}
			
			else {
				System.out.println(" Both doesnt contain the value");
			}
		tyao.remove(14);
		System.out.println(tyao);
		for(int i=0;i<tyao.size();i++) {
			if(tyao.contains(100)) {
				tyao.remove(i);
				
			}
			
		}
		System.out.println(tyao);
			
			
		}
		
	}


