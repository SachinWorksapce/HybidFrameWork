package test.java.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WorkingWithMap {
	
	// Map interface has -: Hashmap, linkedHashMp, Tre
	// the object is stored as key and value 
	// No duplicate key is accepted 
	// Value can be duplicate
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(101, "NonCentury");
		m.put(100, "Century");
		m.put(1, "SingleDigit");
		m.put(0, "Zero");
		// to check the value present 
//		System.out.println(m.containsValue("aha"));
//		System.out.println(m.containsKey(1));
		
		// to get the value based on the key
//		String objectVal=m.get(100);
//		System.out.println(objectVal);
//		
		// To fetch the Key and value one by one we need store in set
		Set<Entry<Integer,String>> n=m.entrySet();
		Iterator<Entry<Integer,String>> y=n.iterator();
		while(y.hasNext()) {
			Map.Entry<Integer, String> u=(Map.Entry<Integer, String>)y.next();
			System.out.println(u.getKey()+"="+ u.getValue());
	
		}
	
		
		
		
	}

}
