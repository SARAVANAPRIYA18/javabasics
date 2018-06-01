package com.basic;

public class Array {
public static void main(String[] args) {
	int arr[]=new int[10];
	int N=1234;
	
		while(N!=0)
		{
			int i=0;
		 arr[i]=N%10;
			System.out.print(" "+arr[i]);
			i++;
			N=N/10;
			
		}
		
		
	
}
}