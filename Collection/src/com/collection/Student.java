package com.collection;

public class Student {
	int id;
	String name;
	String Address;
	public Student(int id, String name, String address) {
		//super();
		this.id = id;
		this.name = name;
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}


	
	

}
