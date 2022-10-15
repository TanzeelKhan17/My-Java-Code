package immutable;

public class EqualAndEqualsMethod {
	public static void main(String[] args) {
		String s="abc";
		String s1="abc";  //// By literal
		String s2="ab";
		String s3="abd";
		
		String a=new String("abc");
		String b=new String("xyz"); //// New Key Word
		String c=new String("bdm");
		String d=new String("ab");
		
		System.out.println(a==s);//false //True
		System.out.println(a==s1);//True //False
		System.out.println(b==s1);//False same
		System.out.println(s==s1);//True // True
		
		System.out.println(a.equals(s));//true
		System.out.println(s.equals(s1));//true
		
		
		
		
	}

}
