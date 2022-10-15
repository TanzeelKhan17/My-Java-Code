package newArrey;

public class NewPractice {
	public static void main(String[] args) {
		long l[]=new long[10];
		l[0]=11l;
		l[1]=22l;
		l[2]=33l;
		l[3]=44l;
		l[4]=55l;
		l[5]=66l;
		l[6]=77l;
		
		for(int i=0;i<l.length;i++)
		{
			System.out.println(l[i]);
		}
		
	}

}


 class NewDemo_1D{
	 public static void main(String[] args) {
		double d[]=new double[10];
		d[0]=22.33d;
		d[1]=22.33d;
		d[2]=22.33d;
		d[3]=22.33d;
		d[4]=22.33d;
		d[5]=22.33d;
		d[6]=22.33d;
		d[7]=22.33d;
		d[8]=22.33d;
		d[9]=22.33d;
	
	 for(double tanzeel:d) {
		 System.out.println(tanzeel);
	 }
	
}}

class New{
	public static void main(String[] args) {
		char c[]=new char[7];
		
		c[0]='T';
		c[1]='A';
		c[2]='N';
		c[3]='Z';
		c[4]='E';
		c[5]='E';
		c[6]='L';
		
		/*
		 * for(int i=0;i<c.length;i++) { System.out.print(c[i]); }
		 */
		
		for(char abc:c) {
			System.out.print(" ");
			System.out.print(abc);
			
		}
	}
}

class New_Test{
	public static void main(String[] args) {
		
	short sh[]=new short[5];
	char c[]=new char[7];
	
	sh[0]=97;
	sh[1]=69;
	sh[2]=88;
	sh[3]=69;
	sh[4]=59;
	
	c[0]='T';
	c[1]='A';
	c[2]='N';
	c[3]='Z';
	c[4]='E';
	c[5]='E';
	c[6]='L';
	
	System.out.print(" MY NAME IS : ");
	
	/*
	 * for(int i=0;i<sh.length;i++) {
	 * 
	 * System.out.print(""+sh[i]); }
	 */
	for(char Boss:c)
	{
		System.out.print(Boss);
	}
	System.out.println();

	System.out.print(" MY MOBILE NUMBER : ");
	for(short Tanzeel:sh) {
		System.out.print(Tanzeel);
	}
}}
 

class Test2{
	public static void main(String[] args) {
	System.out.println(" I want to go : ");
		String st[]=new String[5];
		st[0]=" Work Hard";
		st[1]=" Until Your";
		st[2]=" Success";
		st[3]=" Make";
		st[4]=" Noise";
		
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]);
		}
	
}
 }





