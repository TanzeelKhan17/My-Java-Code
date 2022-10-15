package com.Wrapper;

public class StringMain {
	static void m1() 
	{
		int x=100;
		
		String s=Integer.toString(x);
				System.out.println(s);
		
		
	}
  
	
	public static void main(String[] args) {
	
		
		long l=100;
		Long l2=new Long(l);
		System.out.println(l2);
		String s="10000";
		Long l3=new Long(s);
		System.out.println(l3);
	}

}



