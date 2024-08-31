package test.java.problems;

import java.util.Scanner;

public class StrictDivisor {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int numer=s.nextInt();
		
		int sum=0;
		for(int i=1;i<=numer/2;i++) {
			
			if(numer%i==0) {
				
				sum+=i;
				
			}
			System.out.println(sum);
			
			
		}
	}

}
