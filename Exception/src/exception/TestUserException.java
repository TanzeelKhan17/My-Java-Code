package exception;

import java.util.Scanner;

public class TestUserException {

	void m1(int a, int b) {
		if (a == 2 || b == 2) {
			throw new UserException("Please do not enter 2");
		} else {
			System.out.println(a + b);
		}

	}

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the Number");
			int a = sc.nextInt();
			int b = sc.nextInt();
			TestUserException ts = new TestUserException();
			try {
				ts.m1(a, b);
			} catch (UserException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}

	}
}
