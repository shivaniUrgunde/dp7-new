package com.Labsession;

import java.util.Arrays;

public class SumFirstLast {

	static void evoddArray(int[] ar) {
		int sum = 0;

		int j = ar.length - 1;
		for (int i = 0; i < ar.length / 2; i++) {

			sum = ar[i] + ar[j];
			System.out.println("sum is " + sum);
			j--;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		evoddArray(arr);

	}

}
