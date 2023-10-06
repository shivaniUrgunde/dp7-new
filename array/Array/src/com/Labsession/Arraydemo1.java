package com.Labsession;

import java.util.Scanner;

public class Arraydemo1 {
	
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeArray(int ar[]) {
		boolean flag=false;
		for (int i= 0; i < ar.length; i++) {
			
			flag=isPrime(ar[i]);
			if(flag==true) {
				System.out.println(ar[i]);
			}
			
			}
		
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
		primeArray(arr);
	}

}
