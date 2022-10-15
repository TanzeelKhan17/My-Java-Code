package StringLoopPractice;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Name ");
		System.out.println();
		String s=sc.nextLine();
	int	count=0;
	
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			  if(c!=' ') {
				  count++; 
				  }
			 
			//count++;
		}
		System.out.println("No of Character : "+count);
	}

}
