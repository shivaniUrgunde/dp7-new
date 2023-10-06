package com.Labsession;

import java.util.Arrays;

public class Shiftzero {
	static int[] evoddArray(int[] ar) {
		int index = 0;

		int eve[] = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				eve[index] = ar[i];
				index++;

			}

		}

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > 0) {
				eve[index] = ar[i];
				index++;
			}
		}

		return eve;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,0, 2, 3, 4 ,0};

		int eveodd[] = evoddArray(arr);
		System.out.println(Arrays.toString(eveodd));
	}

}
