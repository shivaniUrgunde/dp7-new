package com.array2d;

import java.util.Arrays;

public class First2d {

	public static void main(String[] args) {
		int arr[][]=new int[2][3];
        int count=1;
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=count++;
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.println(arr[i][j]);
			}
		}
		
	}

}
