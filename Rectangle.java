package com.basic;

public class Rectangle {
double leanth,width;
public double findPerimeter() {
	return 2*(leanth+width);
}
public double findArea() {
	return leanth*width;
}
public double getLeanth() {
	return leanth;
}
public void setLeanth(double leanth) {
	if(leanth >0.0 && leanth <20.0)
	this.leanth = leanth;
	else
		System.out.println("Enter number between 0.0 to 20.0");
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	if(width >0.0 && width <20.0)
	this.width = width;
	else
		System.out.println("Enter number between 0.0 to 20.0");
}
public static void main(String[] args) {
	Rectangle r=new Rectangle();
	
	r.setLeanth(10.2);
	r.setWidth(18.1);
	
	System.out.println("The Area of rectangle : "+r.findArea());
	System.out.println("The Area of rectangle : "+r.findPerimeter());
	}
}
