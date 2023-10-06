package com.Array;

public class Secondhigest {

	static void secondh(int[] ar) {
		int highest = Integer.MIN_VALUE;
		int secondhighest = Integer.MIN_VALUE;

		for (int i = 0; i < ar.length; i++) {
			if (highest < ar[i]) {
				secondhighest=highest;
				highest = ar[i];
				
			} else if (secondhighest < ar[i]) {
				secondhighest = ar[i];
			}
		}
		System.out.println("secondhighest is " + secondhighest);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 4, 5, 9, 3, 7, 8, 2 };

		secondh(arr);

	}

}
