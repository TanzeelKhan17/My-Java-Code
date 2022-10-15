package com.ObjectMethod;

import java.util.Objects;

public class ClassMethodObject {
	private String address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "Details of Boss [Address=" + address + ", Id=" + id + ", Name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		ClassMethodObject c=(ClassMethodObject) obj;
		if(c.getId()==this.id && c.getName()==this.getName() && c.getAddress()==this.address)
		{
			
			return true;
		}
		else
		{
			return false;
		}
		
	}

}

