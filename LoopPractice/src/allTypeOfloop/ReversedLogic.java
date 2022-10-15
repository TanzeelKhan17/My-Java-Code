package allTypeOfloop;

public class ReversedLogic {
	public static void main(String[] args) {
		String s="Tanzeel";
		String s1="";
		for(int i=s.length()-1;i>0;i--) {
			System.out.print(s.charAt(i));
			//s1=s1+s.charAt(i);
		}
	}

}
