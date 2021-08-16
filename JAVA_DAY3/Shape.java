package com.sonata1;

import java.lang.Math;

public class Shape {
	double length;
	double height;
	double width;
	Shape(double length,double height,double width){
		this.length=length;
		this.height=height;
		this.width=width;
	}
	
	public void area(double length,double height,double width){
		System.out.println(length*height*width);
	}
}
	class Triangle extends Shape{
		Triangle(double length,double height,double width){
			super(length,height,width);
		}
		public void area(){
			System.out.println("Triangle Area:"+ (0.5*width*height));
		}
	}
	class Square extends Shape{
		Square(double length,double height,double width){
			super(length,height,width);
		}
		public void area(){
			System.out.println("SquareArea"+Math.pow(length,2));
		}
	}
	class Rectangle extends Shape{
		Rectangle(double length,double height,double width){
			super(length,height,width);
		}
		public void area(){
			System.out.println("RectangeArea:" + (length*width));
		}
}

class Testing{
	public static void main(String[] args) {
		Triangle t = new Triangle(10.0,8.0,10);
		t.area();
		Square s = new Square(10,0,10.0);
		s.area();
		Rectangle r = new Rectangle(10.0,0,10.0);
		r.area();
	}
}