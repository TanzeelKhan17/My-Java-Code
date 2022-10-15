package allTypeOfloop;

public class StringLogic {
	public static void main(String[] args) {
		String s[] = { "Tanzeel", "Khan", "Kashif", "Sohail", "Tyao","Tanzeel" };
		for (int i = 0; i < s.length; i++) {
			if (s[i] == "Tanzeel") {
				System.out.println(s[i] + "   present");
				System.out.println(i + " index");
			}
		}
	}
}

class Test1 {
	public static void main(String[] args) {
		String s[] = { "abcd", "efgh", "ijkl", "mnop", "qrst", "uvwxyz" };
		for (int i = 0; i < s.length; i++) {
			if (s[i] == "uvwxyz") {
				System.out.print(s[i]);
				System.out.print(" " + i);
			}
		}
	}
}

class Test2 {
	public static void main(String[] args) {
		char c[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' };
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'k') {
				System.out.println(c[i]);
				System.out.println(i);
			}

		}
	}
}


class Test3{
	public static void main(String[] args) {
		int a[]= {976988,80826,77000,702191,887916,7021544,};
		for(int i=0;i<a.length;i++) {
			if(a[i]==702191) {
				System.out.println(a[i]);
				System.out.println(i);
				
				
				
				
			}
			
		}
		
		
	}
	
	
}
