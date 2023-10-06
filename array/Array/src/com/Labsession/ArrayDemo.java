package com.Labsession;

import java.util.Scanner;

public class ArrayDemo {
	static void sumArray(int ar[]) {
		int sum=0;
		for (int i= 0; i < ar.length; i++) {
			
			 if(i%2==0)
			 {
				sum+=ar[i];
			 }
			
			}
		System.out.println(sum);
	}
	//enhanced for loop is only for array elements if we want do operation on index 
	static void sumArray1(int ar[]) {
		int sum=0;
		for (int i:ar) {
			System.out.println(i);
			 if(i%2==0)
			 {
				sum+=i;
			 }
			
			}
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the value");
			arr[i]=sc.nextInt();
		}
		System.out.println("addition of alternate pos num is ");
		sumArray(arr);
		System.out.println("addition of alternate pos num with enhanced for loop is ");
		sumArray1(arr);
	}

}
