package newArrey;

import java.util.Random;

public class ArrayT {

	public static void main(String[] args) {
 int a[]=new int[10];
 Random r=new Random();

 
 for(int i=0;i<a.length;i++) {
	int n=r.nextInt(10001);
	 a[i]=n;
 }
 
 for(int f :a) {
	 
	 System.out.println(f);
 }
 
 
 
	}

}
