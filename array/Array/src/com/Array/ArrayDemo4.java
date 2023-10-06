package com.Array;

import java.util.Scanner;

public class ArrayDemo4 {

	static void findele(int ar[], int a) {
		boolean flag = false;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == a) {
				System.out.println("given element is present in array at index " + i);
				flag = true;
			}

		}
		if (flag == false) {
			System.out.println("given element is not present in array");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 9, 2, 20 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element you want to find");
		int n = sc.nextInt();
		findele(arr, n);
	}

}
