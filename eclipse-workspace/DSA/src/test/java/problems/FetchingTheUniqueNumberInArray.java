package test.java.problems;

import java.util.ArrayList;

public class FetchingTheUniqueNumberInArray {
	public static void main(String[] args) {
		
		int a[] = {4,5,6,4,5,7,8};
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			
			if(!al.contains(a[i])) {
				al.add(a[i]);
				count++;
				
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						count++;
						
					}
				}
				System.out.println(a[i] +"="+ count);
			}
			
			
		}
		
	}

}
