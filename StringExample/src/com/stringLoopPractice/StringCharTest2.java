package com.stringLoopPractice;

public class StringCharTest2 {
	
	public static void main(String[] args) {
		String s="AbcdAbcdAbcdAbcdAbcd";
		int count=0;
		for(int i=0;i<s.length();i++) 
		{
			if('A'==s.charAt(i))
			{
				System.out.println("index of : "+i);
				count++;
			}
			
		}
		System.out.println();
		System.out.println("Total Number of : "+count);
	}

}
