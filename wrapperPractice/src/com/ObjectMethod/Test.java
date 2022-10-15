package com.ObjectMethod;

public class Test {

	public static void main(String[] args) {
		
PrcaticeMethod p=new PrcaticeMethod();
p.setName("Zaid");
p.setId(231);
System.out.println(p.toString());
//System.out.println(p.getName());
//System.out.println(p.getId());
System.out.println(p.hashCode());

PrcaticeMethod p1=new PrcaticeMethod();
p1.setName("Zaid");
p1.setId(231);
  System.out.println(p1.equals(p));
	}

}
