package com.sonata2;

public class Tshirt {
	String color;
	String material;
	String design;
	Tshirt(){}
	Tshirt(String c, String m, String d){
		this.color=c;
		this.design=d;
		this.material=m;
	}
	
	public void display() {
		System.out.println("Tshirt Details: ");
		System.out.println(color);
		System.out.println(material);
		System.out.println(design);
	}
	public void size(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Tshirt t1= new Tshirt("white","cotton","plain");
		t1.display();
		t1.size("small");
		Tshirt t2= new Tshirt("black","sweatshirt","hoodie");
		t2.display();
		t2.size("large");
		Tshirt t3= new Tshirt("grey","wool","knitted");
		t3.display();
		t3.size("x-large");
	}

}
