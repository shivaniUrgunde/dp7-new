package com.Array;

import java.util.Arrays;

public class AlternateMerge {
	 static int[] mergeArray(int[] ar1, int[] ar2) {
		 int mar[]=new int[ar1.length+ar2.length];
		 int index=0;
		 int maxlength=Math.max(ar1.length,ar2.length );
		 for (int i = 0; i<maxlength ; i++) {
			 if(i<ar1.length) {
				 mar[index]=ar1[i];
				 index++;
			 }
			 if(i<ar2.length) {
				 mar[index]=ar2[i];
				 index++;
			 }
		 }
			return mar;
		}
	public static void main(String[] args) {
		 int arr[]= {1,2,3,4,5,6};
	      int arr1[]= {10,20,30,40};
	      int mergarray[]=mergeArray(arr,arr1);
	      System.out.println(Arrays.toString(mergarray));

	}

	

}
