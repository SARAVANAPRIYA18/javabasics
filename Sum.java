package com.basic;

import java.util.ArrayList;
import java.util.List;

public class Sum {
	

	public static void main(String args[]) {
		
		ArrayList<String> hh = new ArrayList<>();
		
		
		
		
		
		double sum=0;
		for(int i=0;i<args.length;i++) {
			
			sum=sum+Double.parseDouble(args[i]);
		}
	System.out.println("The sum is "+sum);
	}
}
