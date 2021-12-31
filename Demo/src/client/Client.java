package client;

import com.comp.Comp;
import com.emp.Emp;

public class Client {
public static void main(String[] args) {
	System.out.println(1);
	try {
		try {
			System.out.println(2/0);
		}
		catch(ArithmeticException e) {
			System.out.println(2);
		}
		finally {
			System.out.println("success");
		} 
	String s = "java";
	char at = s.charAt(5);
	System.out.println(at);

	}
	
	catch(NullPointerException e) {
		System.out.println("null pointer exxeception");
	}
	catch(ArithmeticException e) {
		System.out.println(2);
	}
catch(Exception e) {
		System.out.println("superclass of all exception");
	}
	finally {
		System.out.println("done");
	}
	System.out.println(3);
}
}
