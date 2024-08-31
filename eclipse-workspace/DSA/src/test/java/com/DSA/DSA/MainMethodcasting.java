package test.java.com.DSA.DSA;

public class MainMethodcasting {
	public static void main(String[] args) {
		
		UpAndDonCasting u=new Child();  // upcasting 
		u.method(); 
		
		Child c =(Child) u ; // downcasting 
		c.method();
		c.childMethod();
	}

}
