package com.basic;

public class Sum {

	public static void main(String args[]) {
		double sum=0;
		for(int i=0;i<args.length;i++) {
			
			sum=sum+Double.parseDouble(args[i]);
		}
	System.out.println("The sum is "+sum);
	}
}
