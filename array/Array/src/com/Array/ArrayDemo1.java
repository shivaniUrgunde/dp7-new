package com.Array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		/*
		int arr[];
		for(int i=0;i<n;i++) {
			
		}*/
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the value");
			arr[i]=sc.nextInt();
		}
		
       System.out.println(arr);
	}

}
