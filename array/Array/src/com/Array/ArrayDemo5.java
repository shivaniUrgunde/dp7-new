package com.Array;

public class ArrayDemo5 {

	static void maxArray(int ar[]) {
		int max = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					if (ar[i] > max) {
						max = ar[i];
					}

				}

			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 9, 3, 8, 4, 6 };
		maxArray(arr);
	}

}
