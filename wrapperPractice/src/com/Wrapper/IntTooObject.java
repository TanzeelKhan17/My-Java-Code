package com.Wrapper;

public class IntTooObject {
public static void main(String[] args) {
	
	int a=786;
Integer b =	Integer.valueOf(a);
String s=b.toString();
Object o=s;
System.out.println(o.hashCode());
String a1=(String)o;
int b2=Integer.parseInt(a1);
System.out.println(b2);

}
}
