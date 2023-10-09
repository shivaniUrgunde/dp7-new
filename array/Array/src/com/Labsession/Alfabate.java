package com.Labsession;

import java.util.Arrays;

public class Alfabate {

	public static void main(String[] args) {
		char ch[]= {'a','b','c','d','y','z'};
		for(int i=0;i<ch.length;i++) {
			int d=ch[i];
			if(ch[i]<121) {
			
				ch[i]+=2;
				}else if(ch[i]>120 && ch[i]<123) {
					
					ch[i]-=24;
					
				}
		}System.out.println(Arrays.toString(ch));

	}

}
