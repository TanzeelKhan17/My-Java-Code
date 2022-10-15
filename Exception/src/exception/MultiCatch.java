package exception;

import java.io.FileNotFoundException;

public class MultiCatch {
	public static void main(String[] args) {
		try{String i=args[9];
		System.out.println("Input : "+i);
		int a=Integer.parseInt(i);
		System.out.println("Output : "+a);
		}
		catch(ArithmeticException w) {
			System.out.println("in 1st catch block");
			
			}
		catch(NumberFormatException f) {
			System.out.println("in 2nd catch");
		}
		catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("in same argument block");	
		}
		System.out.println(" program flow");
	}

}
