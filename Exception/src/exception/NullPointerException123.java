package exception;


public class NullPointerException123 {
public static void main(String[] args) {
	try{String s=null;
	System.out.println(s.length());
	}
	catch(NullPointerException n) {
		System.out.println("prpogram handle");
	}

	}
}
