package com.basic;

public class MinMaxReverse
{
	int a[] = {3,4,5,2,33,24,2};
	
	public void minimum() {
		int min=a[0],max=a[0];
	    for(int i=1;i<a.length;i++) 
	    {
	        if(min >a[i]) 
			  min=a[i];	  
     	}
	    System.out.println("The Minimum value in the array : "+min);
	for(int i=1;i<a.length;i++)
	{
        if(max < a[i]) 
		  max=a[i];	  
     }
	    System.out.println("The Maximum value in the array : "+max);
	    
}

	public void reverse() {
		int i=0;
		System.out.println("Reverse the above array : " );
		for(i=(a.length-1);i!= 0;i--) {
			System.out.print(" "+a[i]);
		}
	}
	
	public static void main(String[] args) {
		MinMaxReverse m=new MinMaxReverse();
		 m.minimum();
		 m.reverse();
	}
}