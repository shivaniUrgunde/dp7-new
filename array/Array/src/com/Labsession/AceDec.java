package com.Labsession;

import java.util.Arrays;

public class AceDec {
	static int[] evoddArray(int[] ar) {

		int temp = 0;
        int index=0;
		for (int i = 0; i <(ar.length / 2)-1; i++) {
			if (ar[i] > ar[i + 1]) {
				temp = ar[i];
				ar[i] = ar[i + 1];
				ar[i + 1] = temp;
				index++;

			}

		}
		System.out.println(index);
		System.out.println(ar.length);
		for (int i = index; i < ar.length-1; i++) {
			if (ar[i] < ar[i +1]) {
				temp = ar[i];
				ar[i] = ar[i+ 1];
				ar[i + 1] = temp;
				

			}
		}

		return ar;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 1, 3, 6 ,2};

		int eveodd[] = evoddArray(arr);
		System.out.println(Arrays.toString(eveodd));

	}

}
