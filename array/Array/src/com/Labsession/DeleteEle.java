package com.Labsession;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteEle {
	static void evoddArray(int[] ar,int s) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the pos you want to del ele");
        int n1=sc.nextInt();
		ar[n1]=0;
		
		for(int i=n1;i<s;i++) {
			
			ar[i]=ar[i+1];
			//ar[ar.length]=0;
			
		}
		s--;
		for(int i=0;i<s;i++) {
		//ar[3]=n1;
		System.out.println(ar[i]);}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6 };
        int size=(arr.length)-1;
		evoddArray(arr,size);
	}

}
