package org.hm;

public class FindDuplicate {

	public static void main(String[] args) {
		int []a=new int[] {1,2,1};
		
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j < 3; j++) {
				
				if(a[i]==a[j])
					
					System.out.println(a[i]);
				
			}
			
		}

	}

}
