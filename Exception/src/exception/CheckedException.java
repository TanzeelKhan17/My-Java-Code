package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	void m1()throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("");
		
		//System.out.println(a);
		
	}
	public static void main(String[] args)   {
		CheckedException c=new CheckedException();
		try {
			c.m1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("hiiii");
	}
}
	























/*
 * void readfile()throws FileNotFoundException { FileInputStream fis = new
 * FileInputStream("");
 * 
 * } public static void main(String[] args) throws FileNotFoundException {
 * CheckedException ch=new CheckedException(); ch.readfile();
 * System.out.println("hiii"); } }
 */