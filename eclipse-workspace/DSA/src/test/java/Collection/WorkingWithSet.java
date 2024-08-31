package test.java.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class WorkingWithSet {
	public static void main(String[] args) {
		
		// Set interface --> Hash set, LinkedHashSet, treest
		// Insertion is not maintained, it will not accepts duplicate
		
		HashSet s=new HashSet();
		s.add("Bangalore");
		s.add("Hubli");
		s.add("Hubli"); // no duplicate is added 
//		System.out.println(s);
//		s.remove("Hubli");
//		System.out.println(s.size());
//		System.out.println(s);

		// to fetch the object in set iterator interface is use since no insertion order is mainted
		
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
