package exception;

public class PracticeOne {
	public static void main(String[] args) {
		System.out.println(" program Start");
		int a=10,b=0;
	int	c=a/b;// exception break bcz cant devide 10/0...
	System.out.println(c);
	System.out.println(" main method ended");
	}

}

class Practicetwo{
	public static void main(String[] args) {
		System.out.println(" started");
		int a=10,b=0,c;
		
		try // using try block to maintain the flow of program writing riskey code iside this.
		{		// thow the exception to catch.
			System.out.println("inside try block");
			c=a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e) //it handle the exception by catching it.
		{
			
			System.out.println("inside catch method");
			System.out.println("cannot devide by zero   "+e);
		}
		System.out.println("program ended");
		
	}
}