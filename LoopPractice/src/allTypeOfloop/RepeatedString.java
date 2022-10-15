package allTypeOfloop;

public class RepeatedString {
	public static void main(String[] args) {
		String s="Tanzeel eee eee eee";
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='e') {
				count++;
			}
			
		}
		System.out.println(" Count Of E is: "+count);
	}

}


class Test5{
	public static void main(String[] args) {
		String s="wwwertyuiopqwertyuiopqwertyuioasdfghjkqwertyuiopfghjklsdfghj";
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='w') {
			count++;
			
			}
		}
		System.out.println(" Countof w is : "+count);
	}
}

class NewTest{
	public static void main(String[] args) {
		String s="namraaahnamraaahnamraahnamraah";
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a') {
				count++;
				
			}
			
		}
		System.out.println(count);
	}
	
}































