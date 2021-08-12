package com.sonata.AutoShop;

public class MyOwnAutoShop{
	public static void main(String[] args) {
		Sedan se = new Sedan(80,50000,"RED",300);
		Ford  fo1 = new Ford(120,100000,"BLUE",1989,10000);
		Ford  fo2 = new Ford(180,500000,"GREY",2002,10000);
		Car  c = new Car(100,100000,"BLACK");
		Truck T = new Truck(50,200000,"BROWN",1000)
		System.out.println("Default car price:" + String.valueOf(c.getSalePrice()));
		System.out.println("Sedan Selling Price:" + String.valueOf(se.getSalePrice()));
		System.out.println("Ford 1 selling Price:" + String.valueOf(fo1.getSalePrice()));
		System.out.println("Ford 2 selling Price:" + String.valueOf(fo2.getSalePrice()));
	}
	

}


