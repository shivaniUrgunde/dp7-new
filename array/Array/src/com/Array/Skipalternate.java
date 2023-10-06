package com.Array;

import java.util.Arrays;

public class Skipalternate {
	 static int[] mergeArray(int[] ar1, int[] ar2) {
		 
		 int index=0;
		 int maxlength=Math.max(ar1.length,ar2.length );
		 int mar[]=new int[maxlength];
		 int i=0;
		while(index<maxlength) {
			 if(i<ar1.length) {
				 mar[index++]=ar1[i++];
//				 index++;
//				 i++;
			 }
			 if(i<ar2.length) {
				 mar[index++]=ar2[i++];
//				 index++;
//				 i++;
			 }
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
