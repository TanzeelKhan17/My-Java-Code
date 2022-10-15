package com.Seralization;

import java.io.Serializable;

public class Student1 implements Serializable {
	int id;
	String name;

	public Student1(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

}

class Student2 extends Student1{
	
	float fees;
	String college;
	public Student2(int id, String name, float fees, String college) {
		super(id, name);
		this.fees = fees;
		this.college = college;
	}
	
	
	
}
