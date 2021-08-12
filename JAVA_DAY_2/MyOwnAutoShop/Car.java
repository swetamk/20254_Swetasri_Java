
package com.sonata.AutoShop;

public class Car {
	int speed;
	double regularPrice;
	String color;
	
	public Car(int speed, double price, String color) {
		this.speed=speed;
		this.regularPrice=price;		this.color=color;

	}
	public void display() {
		System.out.println(speed);
		System.out.println(regularPrice);
		System.out.println(color);
	}
	public double getSalePrice() {
		return regularPrice;
	}
}

