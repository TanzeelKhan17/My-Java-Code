package com.set;

import java.util.HashSet;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee em =new Employee();
		
		em.setId(110);
		em.setFirstName("Tyao");
		em.setLastName("Chaudhary");
		em.setAddress("Sakinaka");
		
		Employee em1 =new Employee();
		
		em1.setId(110);
		em1.setFirstName("Tyao");
		em1.setLastName("Chaudhary");
		em1.setAddress("Mumbai");

		HashSet<Employee> h=new HashSet<>();
		h.add(em1);
		h.add(em);
		System.out.println(em1);
		System.out.println(em);
		
		
		
		
	}

}
