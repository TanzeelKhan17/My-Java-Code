package com.Seralization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestBoth {
	public static void main(String[] args) {
		FileOutputStream fo;
		ObjectOutputStream ob;
		
		try {
			fo=new FileOutputStream("E:\\Serialization\\Nilhal.java");
			ob= new ObjectOutputStream(fo);
	Student2 st=new Student2(786, "Nihal", 25000.666f, "Bantai College");
	ob.writeObject(st);	
	fo.close();
	ob.close();
	System.out.println(" file copied");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println();
		System.out.println();
// --------############------DSerialization------###################
		FileInputStream fis;
		ObjectInputStream ois;
		
		try {
			fis=new FileInputStream("E:\\Serialization\\Nilhal.java");
			ois=new ObjectInputStream(fis);
			Object oj=ois.readObject();
			
			Student2 stt=(Student2) oj;
			
			System.out.println(" Student Name : "+stt.name);
			System.out.println(" Student Id : "+stt.id);
			System.out.println(" Student College : "+stt.college);
			System.out.println(" Student Fees : "+stt.fees);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}











