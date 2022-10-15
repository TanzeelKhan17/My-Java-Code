package com.stringLoopPractice;

public class NewTestDuplicate {
	
	public static void main(String[] args) {
		
	
	String s="Tanzeel Tanzeel Tanzeel Tanzeel Tanzeel ";
	char c[]=s.toCharArray();
	int a[]=new int[s.length()];
	
	for(int i=0;i<s.length();i++)
	{
		a[i]=1;
		for(int j=1+1;j<s.length();j++)
		{
			if(c[i]==c[j])
			{
				a[i]++;
				c[j]=' ';
			}
			
		}
	}
	for(int i=0;i<s.length();i++)
	{
	if(c[i]!=' ')
	{
		System.out.println(c[i]+" "+a[i]);
	}
	}
	}
}
