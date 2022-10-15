package com.Seralization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serailization {
	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;

		try {
			fos = new FileOutputStream("E:\\Serialization\\Tanzeel.txt");
			oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(420, "Tyao", 10000, 12345678);
			emp.no=123;
			oos.writeObject(emp);
			System.out.println("Employe object Serialised");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
