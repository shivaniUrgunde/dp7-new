package com.Labsession;

public class CharArray {
	

	static void findMax(char ar[])
	{
		char max=Character.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max= ar[i];
			}
		}
		
		System.out.println("Maximum char is :"+max);
	}

	public static void main(String[] args) {
		
		char arr[]= {'A','b','c','D'};
		findMax(arr);
	}

}
