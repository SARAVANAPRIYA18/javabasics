package com.basic;

public class ThreeDimensionalShape extends Shape{
float height;
double area;
public void  cylinder(int length,int height) {
	 area= (2*3.17*length*height)+(2*3.17*length*length);
	 System.out.println("Cylinder : "+area);
}
	
public void  sphere(int length) {
    area=4*3.17*length*length;	
    System.out.println("Sphere : "+area);
}

public static void main(String[] args) {

 ThreeDimensionalShape threeshape=new ThreeDimensionalShape();
 threeshape.print();
 threeshape.cylinder(6,8);
 threeshape.sphere(8);

}


}
