package com.polymrphism;

import com.TestEncapsulation.Test;

public class TestOverloading {
	void tyao(String s) {
		System.out.println(s);
	}

	void tyao(int i) {
		//i = 100;
		System.out.println(i);

	}
	
	void tyao(float f) {
		//f=10.5f;
		System.out.println(f);
	}
	void tyao(char a) {
		//a='T';
		System.out.println(a);
	}
	public static void main(String[] args) {
		TestOverloading t=new TestOverloading();
	t.tyao('g');
	t.tyao(55.0f);
	t.tyao(100);
	t.tyao("Tanzeel");
	}

}
