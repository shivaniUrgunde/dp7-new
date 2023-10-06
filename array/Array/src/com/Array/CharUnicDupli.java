package com.Array;

import java.util.Arrays;

public class CharUnicDupli {

	static void findfreq(char ar[]) {
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
				System.out.println("duplicate  char is "+ar[i]);
			}else if (count==1) {
				System.out.println("unic  char is "+ar[i]);
			}
    	}
    }
	public static void main(String[] args) {
		char arr[]= {'a','b','c','d','a','f','g','d'};
		findfreq(arr);
		System.out.println(Arrays.toString(arr));

	}

}
