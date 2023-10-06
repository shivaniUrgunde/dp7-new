package com.Array;

import java.util.Arrays;

public class CompleteMerge {
     static int[] mergeArray(int ar1[],int ar2[]) {
    	 int mar[]=new int[ar1.length+ar2.length];
    	 int i=0;
    	 for (int j = 0; j< ar1.length; j++) {
    		 mar[i]=ar1[j];
    		 i++;
    	 }
    	 for (int j = 0; j< ar2.length; j++) {
    		 mar[i]=ar2[j];
    		 i++;
    	 }
    	 return mar;
     }
	public static void main(String[] args) {
		
      int arr[]= {1,2,3,4};
      int arr1[]= {10,20,30,40};
      int mergarray[]=mergeArray(arr,arr1);
      System.out.println(Arrays.toString(mergarray));
    		  
	}

}
