package com.stringBuffer;

public class StringDemo1 {
	public static void main(String[] args) {

		String s1 = new String("khan");
		String s2 = new String("khan");
		System.out.println(s1==s2);//false
		String s3="khan";
		System.out.println(s1==s3);//false
		String s4="khan";
		System.out.println(s3==s4);//true
		String s5="kh"+"an";
		System.out.println(s3==s5);//true
		String s6="kh";				
		String s7=s6+"an";			// creating object of s7 in heap as khan
		System.out.println(s3==s7);//false
		final String s8="kh";
		String s9=s8+"an";
		System.out.println(s3==s9);//true
		System.out.println(s6==s9);//false
		
		
		
		
	}
}
