package com.Array;

import java.util.Arrays;

public class Secondhigh {
	
	static int secondArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
		return ar[ar.length-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 8, 4, 6, 2 };
		
    System.out.println(secondArray(arr));
	}

}
