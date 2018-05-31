package com.basic;

public class Invoice {
      String partNumber,partDescription;
      int quatity;
      double price,amount;
	public String getPart_number() {
		return partNumber;
	}
	public void setPart_number(String part_number) {
		this.partNumber = part_number;
	}
	public String getPart_description() {
		return partDescription;
	}
	public void setPart_description(String part_description) {
		this.partDescription = part_description;
	}
	public int getQuality() {
		return quatity;
	}
	public void setQuality(int quality) {
		if(quality<0)
			this.quatity = 0;
		else
		    this.quatity = quality;
	}
	public double getPrice() {
		
		  return price;
	}
	public void setPrice(double price) {
		if(price<0)
			this.price = 0.0;
		else
		   this.price = price;
	}
      
      public double getInvoiceAmount()
      {
    	 amount= quatity * price;
    	 return amount;
      }
      
      public static void main(String[] args)
      {
    	  Invoice invoice =new Invoice();
          invoice.setPrice(100.0);
          invoice.setQuality(100);
          invoice.getInvoiceAmount();
    	  System.out.println("Invoice Amount is "+ invoice.getInvoiceAmount());
      }
      
      
      
      
      
}

