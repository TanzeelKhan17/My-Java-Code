package exception;

public class NumberFormat {
public static void main(String[] args) {
	try{ 
		String s="tanzeel";
	
	int a=Integer.parseInt(s);
	System.out.println(a);
	}
	catch(NumberFormatException tanzeel) {
		System.out.println("Please dont enter the Character");
	}
	System.out.println("program ");
}
}


class NumberFormat2{
	public static void main(String[] args) {
		
	
	String s="Bossss";
	int a=Integer.parseInt(s);
	System.out.println(a);
	
}}