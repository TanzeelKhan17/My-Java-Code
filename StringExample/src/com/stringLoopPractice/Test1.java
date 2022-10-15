package com.stringLoopPractice;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ENTER WHAT YOU U WANT TO COUNT : ");
		String s = sc.nextLine();

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ')
				;
			count++;

		}
		System.out.println(count);
	}

}

class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ENTER  WHAT U COUNT ");
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ') {

			count++;}

		}
		System.out.print(count);


	}
}
