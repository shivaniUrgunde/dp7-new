package com.Array;

import java.util.Arrays;

public class LeftRotate {
	static void rotate(int[] ar) {
		int lastE=ar[0];
		for (int i = 0; i <ar.length-1; i++) {
			ar[i]=ar[i+1];
			
		}
		ar[ar.length-1]=lastE;
		System.out.println(Arrays.toString(ar));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		rotate(arr);
	}

}
