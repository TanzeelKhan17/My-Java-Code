package newArrey;

public class Demo1 {
	public static void main(String[] args) {
		float ar[]=new float[7];
		ar[0]=20;
		ar[1]=30;
		ar[2]=40;
		ar[6]=300;
		
		/*
		 * for(int i=0;i<ar.length;i++) { System.out.println(ar[i]); }
		 */
		for(float tanzeel:ar)
		{
		System.out.println(tanzeel);	
		}
	}
	

}
