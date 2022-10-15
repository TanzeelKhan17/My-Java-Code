package scannerProgram;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	while(true) {Scanner sc=new Scanner(System.in);
	System.out.println(" Enter First Number");
	float a=sc.nextFloat();
	System.out.println(" Enter Second Number");
	float f=sc.nextFloat();
	System.out.println("1 Add,2 Sub,3 Multi,4 Divide,5 Percentage");
	int calculate=sc.nextInt();
	switch (calculate) {
	case 1:
		System.out.println(a+f);
		break;
	case 2:
		System.out.println(a-f);
		break;
	case 3:
		System.out.println(a*f);
		break;
	case 4:
		System.out.println(a/f);
		break;
	case 5:
		System.out.println((a/f)*100+"%");
		break;

	default:
		System.out.println("Do not Enter Above 4");
		break;
	}
}
}
}