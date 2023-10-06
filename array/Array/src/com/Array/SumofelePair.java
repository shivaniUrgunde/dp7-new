package com.Array;

public class SumofelePair {

	static void secondh(int[] ar, int s) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < s) {
				for (int j = i + 1; j < ar.length; j++) {

					if (ar[i] + ar[j] == s) {
						System.out.println("(" + ar[i] + "," + ar[j] + ")");
					}

				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 9, 3, 7, 8, 2 };
		int sum = 7;
		secondh(arr, sum);

	}

}
