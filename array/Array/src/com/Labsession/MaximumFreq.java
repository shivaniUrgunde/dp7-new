package com.Labsession;

import java.util.Arrays;

public class MaximumFreq {

	static void findfreq(int ar[]) {
		boolean visited;
		int count;
		int[] arr = new int[ar.length];
		int num[] = new int[ar.length];
		int index = 0;
		int value = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			count = 1;
			visited = false;
			for (int j = i - 1; j > 0; j--) {
				if (ar[i] == ar[j]) {
					visited = true;
					break;
				}
			}
			if (visited == false) {
				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i] == ar[k]) {
						count++;
					}
				}
				arr[index] = ar[i];
				num[index] = count;
				index++;

				// System.out.println("duplicate number is "+ar[i]+" "+count);
			}
		} // System.out.println(Arrays.toString(num));
		for (int s = 0; s < index; s++) {
			System.out.print(num[s] + " ");
		}
		System.out.println(" ");
		for (int n = 0; n < ar.length; n++) {

			if (num[n] >= max) {

				max = num[n];
				if (num[n] == max) {
					value = arr[n];
					System.out.println("the value is " + value + " freq is " + max);
				}

			}

		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 2, 7, 4, 4, 9, 5, 6, 3, 8 };
		findfreq(arr);
		// System.out.println(Arrays.toString(arr));

	}

}
