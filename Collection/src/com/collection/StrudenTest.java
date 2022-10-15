package com.collection;

import java.util.ArrayList;

public class StrudenTest {
	public static void main(String[] args) {
		ArrayList<Student>s=new ArrayList<>();
		s.add(new Student(420, "Tanzeel", "Vikhroli"));
		s.add(new Student(111, "Junaid", "Tilak nagar"));
		s.add(new Student(222, "Hassan", "Sakinaka"));
		s.add(new Student(333, "Kashif", "Parksite"));
		s.add(new Student(444, "Ajaz", "Jari mari"));
		s.add(new Student(555, "Abu Huraira", "Asalfa"));
		//System.out.println(s);
		long start = System.currentTimeMillis();
		for(int i=0;i<s.size();i++) {
			Student e=s.get(i);
			System.out.println(e.id+" "+e.name+" "+e.Address);
		}
	
		long ends = System.currentTimeMillis();
		System.out.println(ends-start);
		
	}

}
