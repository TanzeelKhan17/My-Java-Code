package com.ObjectMethod;

public class Test1 {
	public static void main(String[] args) {
		
	ClassMethodObject cm=new ClassMethodObject();
	ClassMethodObject cm1=new ClassMethodObject();
	
	cm.setId(110);
	cm.setName("Tanzeel");
	cm.setAddress("Dubai");
	
	cm1.setId(110);
	cm1.setName("Tanzeel");
	cm1.setAddress("Dubai");
	
	System.out.println(cm);
	System.out.println(cm1.hashCode());
	System.out.println(cm.toString());
	System.out.println(cm1.equals(cm));
	
	
	
	
	
	}
}
