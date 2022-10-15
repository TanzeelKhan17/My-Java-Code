package com.stringLoopPractice;

public class StringOutChar {

	public static void main(String[] args) {
		

		String s=" tanzeeel tanzeel tanzeel";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if('e'==s.charAt(i))
			{
				System.out.println("Index of "+i);

				count++;
			}
		}
		System.out.println(count);
	}
}

class New{
	 public static void main(String[] args) {
		
	
		String s="alibaba alibaba laibaba alibaba alibaba";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		if('b'==s.charAt(i))
		{
			System.out.println("index of : "+i);
			count++;
		}
		}
		System.out.println(count);
	}}

