package com.Array;

import java.util.Arrays;

public class Findfreqwithoutchange {
	static void findfreq(int ar[]) {
		boolean visited;
		int count;
		for (int i = 0; i < ar.length; i++) {
			 count=1;
			 visited=false;
			 for (int j = i-1; j> 0; j--) {
				 if(ar[i]==ar[j]) {
					 visited=true;
					 break;
				 }
			 }
			 if(visited==false) {
				 for (int k = i+1; k < ar.length; k++) {
					 if(ar[i]==ar[k]) {
						 count++;
					 }
				 }System.out.println("duplicate  number is "+ar[i]+" "+count);
			 }
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,2,7,4,9,5,4,6,3,8};
		findfreq(arr);
		System.out.println(Arrays.toString(arr));
	}

}
