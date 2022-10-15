package com.set;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
	public static void main(String[] args) {
		Random r= new Random();
		int a=r.nextInt(10000);
		System.out.println("Your OTP "+a);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the OTP");
		int b=sc.nextInt();
		if(a==b) {
			System.out.println("Valid OTP");
		}
		else {
			System.out.println("Not Valid OTP");
		}
		
	}

}
