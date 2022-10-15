package com.ObjectMethod;

public class PrcaticeMethod 
{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		
		return name.length()+id;
		
		
	}
	@Override
	public String toString() {
		return "first name "+ name ;
	}	
	@Override
	public boolean equals(Object obj) {
		PrcaticeMethod pm=(PrcaticeMethod)obj;
	  
		if(pm.getId()==this.id&& pm.getName()==this.name)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
