package com.Wrapper;

public class IntTostring {
	public static void main(String[] args) {

		Auto_Boxing();

	}
	 static void Auto_Boxing() {
		 long l=20l;
		 String s=Long.toString(l);
		 System.out.println(" in String "+s);
		 long g=Long.parseLong(s);
		 System.out.println(" in Long "+g);
	 }

	 static void int_tostring()
	 {
		 int b = 200;
			Integer c = Integer.valueOf(b);// premetive int to Integer object
			String s = c.toString();// Integer to String
			System.out.println("is in String  " + s);

			
			int d = Integer.parseInt(s);// String to int
			System.out.println("in int " + d);
	 }
	 
}
