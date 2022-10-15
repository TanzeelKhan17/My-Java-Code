package com.Seralization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.Seralization.Employee;

public class Test_Deserilastion{
public static void main(String[] args)throws IOException,ClassNotFoundException {
	FileInputStream fis=new FileInputStream("E:\\\\Serialization\\\\Tanzeel.txt");
	ObjectInputStream ob=new ObjectInputStream(fis);
	Object obj=ob.readObject();
	Employee e=(Employee) obj;
	System.out.println("My id is : "+e.id);
	System.out.println("My Name is : "+e.name);
	System.out.println("My Salary is : "+e.salary);
	System.out.println("My ssn is : "+e.ssn);
	System.out.println("my int `" + e.no);
}
}
