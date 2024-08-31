package test.java.problems;

public class StaticClassandObject {
	
	String name="sachin";
	long Phno;
	String adress;
	public StaticClassandObject(long Phno,String adress) {
		
		this.Phno=Phno;
		this.adress=adress;
		
	}
	
	public String getAdress() {
		return name;
	}
	
	public static void main(String[] args) {
		StaticClassandObject s=new StaticClassandObject(9999,"Bangalore");
		System.out.println(s.getAdress());
		StaticClassandObject s1=new StaticClassandObject(888, "hubli");
		System.out.println(s1.getAdress());
	}

}
