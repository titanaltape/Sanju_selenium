package org.tn;

public class Strtypes {
	public static void main(String[] args) {
	String s="java";
	String s1="Selenium";
	String s2="Selenium";
	System.out.println("Literal String");
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	
	String s3 = new String ("Sql");
	String s4 = new String ("Database");
	String s5 = new String ("Database");
	System.out.println("Non Literal String");
	System.out.println(System.identityHashCode(s3));
	System.out.println(System.identityHashCode(s4));
	System.out.println(System.identityHashCode(s5));
	}

}
