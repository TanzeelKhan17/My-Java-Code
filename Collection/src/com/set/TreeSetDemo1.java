package com.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		TreeSet<Character> c=new TreeSet<>();
		c.add('z');
		c.add('e');
		c.add('l');
		c.add('n');
		c.add('a');
		c.add('t');
		//c.add('k');
		System.out.println(c);
		System.out.println(c.ceiling('k'));
		System.out.println(c.ceiling('k'));
		System.out.println(c.floor('f'));
		System.out.println(c.subSet('a', 'l'));
		System.out.println(c.tailSet('l'));
		System.out.println(c.headSet('l'));

		
		TreeSet<String> c1=new TreeSet<>();
		c1.add("ajaz");
		c1.add("nehal");
		c1.add("kashif");
		c1.add("umer");
		System.out.println(c1);

		
	}

}
