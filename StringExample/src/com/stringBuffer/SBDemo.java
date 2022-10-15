package com.stringBuffer;

public class SBDemo {

	public static void main(String[] args) {
		// SBDemo s = new SBDemo();
		String s = "Kashif Extend Tanzeel";
		String s1 = " Kashif  Baccha hai tu mera";
		// int a=10;
		StringBuffer sb = new StringBuffer(s);
		/*
		 * StringBuffer r = sb.reverse(); System.out.println(r); //
		 * System.out.println(s.equals(r));
		 */System.out.println(" It Shows the Default index : " + sb.capacity());

		// System.out.println(sb.append(s1));
		sb.append("hiiii");
		sb.append(" byeee");
		System.out.println(sb);
		System.out.println(" charAt : " + sb.charAt(24));
		System.out.println("charAt : " + sb.charAt(23));
		
		StringBuffer sb2 = new StringBuffer("Tanzeel");
		//System.out.println(sb2.reverse());
		
		
		System.out.println(sb2.insert(5, "xyz"));
		System.out.println(sb2.delete(3, 6));

	}

}
