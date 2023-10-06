package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		/*
		int arr[];
		for(int i=0;i<n;i++) {
			
		}*/
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the value");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
       System.out.println(Arrays.toString(arr));
	    System.out.println("sum of array is "+sum);

      float ar[]= {34.2f,76.9f,34.5f,65.8f};
      float sumf=0f;
      for(int j=0;j<arr.length;j++) {
    	  sumf+=ar[j];
      }
      System.out.println("sum of array is "+sumf);
	}

}
