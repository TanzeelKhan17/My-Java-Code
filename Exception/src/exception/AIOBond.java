package exception;

import java.util.Scanner;

public class AIOBond {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the index Number");

		int b=sc.nextInt();
		try{System.out.println(a[b]);}
		catch(Exception t) {System.out.println("array handle over here");}

		/*
		 * try{ //System.out.println(a[7]); for(int i=0;i<=a.length;i++) {
		 * System.out.println(a[i]); } }
		 * 
		 * catch(ArrayIndexOutOfBoundsException Tanzeel) {
		 * System.out.println("index out of bond for length "+a.length); }
		 */
		System.out.println(" progran Finish");
	}
	

}    
