package com.Array;

import java.util.Arrays;

public class RightRotateArray {
	static void rotate(int[] ar) {
		int lastE=ar[ar.length-1];
		for (int i = ar.length-1; i >0; i--) {
			ar[i]=ar[i-1];
			
		}
		ar[0]=lastE;
		System.out.println(Arrays.toString(ar));
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		rotate(arr);
		rotate(arr);
		rotate(arr);

	}

}
