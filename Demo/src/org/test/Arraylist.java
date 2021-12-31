package org.test;


import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(2);
		l.add(20);
		l.add(75.25);
		l.add("san");
		// add values to the list 
		
		System.out.println(l);
		l.add(3,'M');
		System.out.println("After add the new value"+l);
		
		l.remove(2);
		System.out.println("Remove Index of 2"+l);
		
		Object e = l.get(1); //return type
		System.out.println(e); //get the value of the index
		
		Object set = l.set(2,60);
		System.out.println(set);
		
		for(Object object:l) {
			System.out.println(object);
			//Enhanced for loop
		}
		
		for (int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		l.removeAll(l);
		System.out.println(l);
	}

}
