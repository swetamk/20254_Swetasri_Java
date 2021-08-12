
package com.sonata.AutoShop;

public class Ford extends Car{
	int year;
	int manufacturerDiscount;
	public Ford(int speed, double price, String color, int year, int disc) {
		super(speed, price, color);
		this.speed=speed;
		this.regularPrice=price;
		this.color=color;
		this.year=year;
		this.manufacturerDiscount=disc;
	}
	public double getSalePrice() {
		return super.regularPrice-manufacturerDiscount;
		
	}
}