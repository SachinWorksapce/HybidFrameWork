package test.java.com.DSA.DSA;


  
 public class UpAndDonCasting {
	

	
public void method() {
	System.out.println("Upcasting method");
}


}
 
 class Child extends UpAndDonCasting {
		
		public void method() {
			System.out.println("Child method");
		}
		
		public void childMethod() {
			System.out.println("Present only in child");
		}
}
