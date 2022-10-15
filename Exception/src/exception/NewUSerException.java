package exception;

import java.util.Scanner;

public class NewUSerException {
void m1(int age) {
	if(age<18) {
		throw new UserException("Sorry u cant vote Age is Less than 18");
	}else {
		System.out.println("Welcome to vote");
	}
	
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the AGE");
	int a=sc.nextInt();
	NewUSerException n=new NewUSerException();
	
	try {
		n.m1(a);
	} 
	catch (UserException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
