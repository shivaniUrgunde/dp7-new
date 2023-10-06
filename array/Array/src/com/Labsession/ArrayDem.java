package com.Labsession;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDem {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("enter the value");
			arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		int temp=0;
		System.out.println("enter the value you have to enter at third position");
		int n1=sc.nextInt();
		
		for(int i=arr.length-1;i>3;i--) {
			
			arr[i]=arr[i-1];
			
		}
		arr[3]=n1;
		System.out.println(Arrays.toString(arr));
	}

}
