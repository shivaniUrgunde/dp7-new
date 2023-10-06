package com.Array;

public class DuplicateUnicFreq {

	static void findfreq(int ar[]) {
    	int count;
      
    	for (int i = 0; i < ar.length; i++) {
    		if(ar[i]=='\0') 
    			continue;
    		
    		
    	 count=1;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
					ar[j]='\0';
					
				}	
			}//System.out.println("freq of number "+ar[i]+"is "+count);
			if (count>1) {
				System.out.println("duplicate  number is "+ar[i]);
			}else if (count==1) {
				System.out.println("unic  number is "+ar[i]);
			}
    	}
    }
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,2,7,4,9,5,4,6,3,8,0};
		findfreq(arr);
	}
}
