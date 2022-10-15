package com.Wrapper;

public class IntToInteger {

	public static void main(String[] args) {
int a=111;
Integer i=Integer.valueOf(a); //converting int to Integer object
System.out.println(i);
int b=i.valueOf(a);//converting Integer object to Premetive int

	}

}
