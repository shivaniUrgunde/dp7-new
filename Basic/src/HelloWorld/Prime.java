package HelloWorld;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start num");
		int start=sc.nextInt();
		System.out.println("enter end num");
		int end=sc.nextInt();
		while(start<end) {
		if(start>1) {
			int count=0;
			if(start%2==0 || start%3==0 )
			    {
				System.out.println("not prime num");
				}
			else {
				count++;
				if(count%2==0) {
					System.out.println(start);
				}
				
		         }}
			else {
			System.out.println("not prime num");
		}
		start++;}
		
		
		
	}

}
