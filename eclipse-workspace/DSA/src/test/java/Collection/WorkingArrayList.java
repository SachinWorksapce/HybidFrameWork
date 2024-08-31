package test.java.Collection;

import java.util.ArrayList;
import java.util.List;

public class WorkingArrayList {
	
	public static void main(String[] args) {
		
		List a=new ArrayList();
		a.add("Naveen");
		a.add("India");
		a.add("India");
		System.out.println(a);
		a.add(0, "Engaland");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		a.remove("India");
		System.out.println(a);
		
		// to fetch the value from the index
		Object c=a.get(0);
//		System.out.println(a);
//		System.out.println(c);
		boolean t=a.contains("Naveen");
		System.out.println(t);
		// To clear the List
		//a.clear();
		
		// To know the index of the object by passing the value
		System.out.println(a.indexOf("India"));
		
		//To know the List or list class is empty 
	
		 System.out.println(a.isEmpty()); 
		 
		 // To know the Size 
		 
		 int sizeOfcollection=a.size();
		 System.out.println(sizeOfcollection);
		
	}

}
