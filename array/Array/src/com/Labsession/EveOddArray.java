package com.Labsession;

import java.util.Arrays;

public class EveOddArray {
	static int[] evoddArray(int[] ar) {
		int index = 0;

		int eve[] = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				eve[index] = ar[i];
				index++;

			}

		}

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] % 2 != 0) {
				eve[index] = ar[i];
				index++;
			}
		}

		return eve;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };

		int eveodd[] = evoddArray(arr);
		System.out.println(Arrays.toString(eveodd));
	}

}
