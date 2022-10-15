package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {

	void read() throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("");
		
	}
	
	void m1() throws FileNotFoundException 
	{
		System.out.println("Hello");
		//throw new FileNotFoundException("File not found");
		read();
	}
	public static void main(String[] args) throws FileNotFoundException {
		Throws t=new Throws();
		t.m1();
		
		/*
		 * try { t.m1(); } catch (FileNotFoundException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		System.out.println("Tanzeel");
	}
}
