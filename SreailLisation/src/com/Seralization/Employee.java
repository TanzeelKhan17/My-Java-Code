package com.Seralization;

import java.io.Serializable;

public class Employee implements Serializable{
int id;
String name;
double salary;
transient int ssn;
static int no;

public Employee(int id,String name,double salary,int ssn) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	//this.no= no;
	this.ssn=ssn;
}
}
