package com.Array;

public class EnhancedFor {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 8, 4, 6, 15 };
		for (int i : arr) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
