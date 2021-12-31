package org.tn;

public class Imandmutable {
	public static void main(String[] args) {
		String s="java";
		String s1="Selenium";
		String s2=s.concat(s1);
		System.out.println("Immutable String");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		StringBuffer s3 = new StringBuffer ("Sql");
		StringBuffer s4 = new StringBuffer ("Database");
		StringBuffer s5 = new StringBuffer ("Database");
		System.out.println("Mutable String");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
	}

}
