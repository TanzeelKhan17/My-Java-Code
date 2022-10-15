package StringLoopPractice;

public class StringWordCount {
	public static void main(String[] args) {
	 final Integer a=10;	
	System.out.println(a+10);
	System.out.println(a);
	 
	final String s="Tanzeel";
	final String s1=new String("Junaid");
	s1.concat(" Khan");
   s.concat(" Khan");
   System.out.println(s);
   System.out.println(s1);
   
   final StringBuffer sb=new StringBuffer("Zaid");
   System.out.println(sb);
   System.out.println(sb.hashCode());
	sb.append(" Khan");
	System.out.println(sb);
	System.out.println(sb.hashCode());
	StringBuffer sb1=new StringBuffer();
	//sb=sb1;
	}

}
