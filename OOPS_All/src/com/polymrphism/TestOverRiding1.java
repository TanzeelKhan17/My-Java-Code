package com.polymrphism;

public class TestOverRiding1 {

	int add(int a, int b) {
		System.out.println(" Addition of 1st method");
		return a + b;
	}

}

class Test2 extends TestOverRiding1{
	
	int add(int a, int b) {
		System.out.println(" Addition of 2nd method");
		return a + b;
	}
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.add(10, 10);
	}
}
