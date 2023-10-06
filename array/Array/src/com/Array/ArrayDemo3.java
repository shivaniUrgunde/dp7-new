package com.Array;

import java.util.Arrays;

public class ArrayDemo3 {

	static void squareArray(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = ar[i] * ar[i];
		}
		System.out.println(Arrays.toString(ar));
	}

	static void sumArray(int ar[]) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				sum += ar[i];
			}
		}
		System.out.println("sum of array " + sum);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6 };
		System.out.println("before=====================================================");
		sumArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("after=====================================================");
		squareArray(arr);
		System.out.println(Arrays.toString(arr));
		sumArray(arr);
	}

}
