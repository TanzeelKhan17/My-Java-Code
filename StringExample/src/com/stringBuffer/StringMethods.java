package com.stringBuffer;

public class StringMethods {
	public static void main(String[] args) {
		String s = "Tanzeel Khan and i am a software developer ";
		String s1 = "Software Developer";
		StringBuffer s3 = new StringBuffer(s1);
		StringBuffer t = s3.reverse();
		System.out.println(t);
		System.out.println(" Length of String : " + s.length() + "  " + s1.length());// showing length
		System.out.println(" index of : " + s.indexOf('z'));// finding index on specific character
		System.out.println(" Charecter on index : " + s.charAt(3));// index to find specific character
		System.out.println(" reverse of String : " + s);

		System.out.println("!@#$%^&*()_!@#$%^&*(!@#$%^&*(!@#$%^&*!@#$%^");
		System.out.println(" SubString with beginning index : " + s.substring(7));// ye wahi se shuru hoga jaha se
																					// argument me jo index denge
		System.out.println(" substring with index start and end : " + s.substring(7, 13));// ye shuru hogajaha value
																							// denge aur khatam hoga end
																							// value pe uske beech ka

System.out.println(s.replace('T', 'k'));																					// value print hoga

		String[] t1 = s.split("\\s"); // for(String w:t1) { System.out.println(w); }

		for (int i = 0; i < t1.length; i++) {
			System.out.println(t1[i]);
		}
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.replace('T', 'k'));
	
		
	}

}
