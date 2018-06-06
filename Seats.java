package com.basic;

import java.util.Scanner;

public class Seats {

	int seat[]= {0,0,0,0,0,0,0,0,0,0};
	int firstClassSeat=0;
	int economySeatStart=5;
	int lastseat=10;
	public void choice() 
	 {
		System.out.println("Please type 1 for First Class and Please type 2 for Economy. ");
	 }
	
	public void type(int choice) {
		
		
		       if(choice == 1) 
		       
		       {  if(firstClassSeat<5)
		    	   { 
		    		seat[firstClassSeat]=1;
		    		System.out.println();
			        System.out.println(" Seat number : "+(firstClassSeat+1));
			        System.out.println(" Class       : The First-Class ");
			        System.out.println();
			        firstClassSeat++;
		    	   }
		       else
		       {
		    	   System.out.println("The seat is not available");
		       }
		       
		       }
			     
		      else
		      {
		    	  if(economySeatStart<10) {
		    	  seat[economySeatStart]=1;   	 
		          System.out.println(" Seat number : "+(economySeatStart+1));
			      System.out.println(" Class       : The Economic Section ");
			      economySeatStart++;
		      }
		    	  else
		    	  {
		    		  System.out.println("There is no seats available in Economic Section.");
		    		  System.out.println("Economy Section is fully booked. Would you like Firstclass? 1 for Yes 2 for No ");
	     	    	  Scanner input=new Scanner(System.in);
	     	   		  int decision=input.nextInt();
	     	   		  assignment(decision);
	     	   		  
		    	  }
		      }
	}
    	
	
	public boolean check(int number) {
		int i=number;

			if(seat[i-1]==1)
			{
				System.out.println("The seat "+i+" is no longer available.  ");
				System.out.println();
				return true;
			
			}
			else
			{
				System.out.println("The seat "+i+" is Empty.  ");
				System.out.println();
				return false;
			}
	}
	
    public void assignment(int choice)
	{
		if( choice == 1 )
	{
			System.out.println("Next flight leaves in 3 hours.");
			
	}else if(choice == 2)
	{
		type(1);
	}
	else {
		System.out.println("Please enter your decision ");
	}
		
	}
	
	
	
	public static void main(String[] args) {
		Seats reservation=new Seats();
		System.out.println("          ******Airline Reservations System******    ");
		reservation.choice();
		reservation.type(2);
		reservation.check(1);
		reservation.type(2);
		reservation.check(6);
		reservation.type(2);
		reservation.check(2);
		reservation.type(2);
		reservation.check(4);
		reservation.type(2);
		reservation.check(7);
		reservation.type(2);
		
		
		
	}
	
	
}
