package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Abc
{
 void readFile() 
 {
	 System.out.println("Parent Class read Method");
 }

}
public class ChildException extends Abc {
  @Override
void readFile() throws ArithmeticException {
	//FileInputStream fis=new FileInputStream("");
	System.out.println("Child Class Read Method");
	
	
}
	
	public static void main(String[] args) {
		
		Abc a=new ChildException();
		a.readFile();
	}
	
	
}
