package com.sonata.AutoShop;

public class Truck extends Car{
	int weight;
	public Truck(int speed, double price, String color, int weight) {
		super(speed, price, color);
		this.speed=speed;
		this.regularPrice=price;
		this.color=color;
		this.weight=weight;
	}
	
	public double getSalePrice() {
		
		if (weight>2000) {
			return (0.10*regularPrice)+regularPrice;
		}
		else
			return (0.20*regularPrice)+regularPrice;
	}

}
