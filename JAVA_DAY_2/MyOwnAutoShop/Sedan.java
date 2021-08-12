package com.sonata.AutoShop;

public class Sedan extends Car{
		int length;
		public Sedan(int speed, double price, String color,int len) {
			super(speed, price, color);
			this.speed=speed;
			this.regularPrice=price;
			this.color=color;
			this.length=len;

		}


		public double getSalePrice() {
			if (length>20) {
				return (0.05*regularPrice)+regularPrice;
			}
			else
				return (0.10*regularPrice)+regularPrice;
		}

		}