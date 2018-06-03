package com.basic;

public class TwoDimensionalShape extends Shape{
	float width,area;
	public void square(int length) {
		 area=length*length;
		 System.out.println("Square : "+area);
	}
	public void rectangle(int length,int width) {
		area=length*width;
		System.out.println("Rectangle : "+area);	
	}
	
	public static void main(String[] args) {
		TwoDimensionalShape twoshape=new TwoDimensionalShape();
		twoshape.print();
		twoshape.square(5);
		twoshape.rectangle(5,6);
	}
}
