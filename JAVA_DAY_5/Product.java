package com.sonata.mob;

public class Product {
	private int ProdID;
	private String ProdName;
	private String ProdCategory;
	private int ProdPrice;
	public Product(int id, String name, String cat, int price) 
	{
		super();
		this.ProdID = id;
		this.ProdName = name;
		this.ProdCategory = cat;
		this.ProdPrice = price;
	}
	public int getPid() {
		return ProdID;
	}
	public void setProdID(int id) {
		this.ProdID = id;
	}
	public String getname() {
		return ProdName;
	}
	public void setname(String name) {
		this.ProdName = name;
	}
	public String getcat() {
		return ProdCategory;
	}
	public void setPcat(String cat) {
		this.ProdCategory = cat;
	}
	public int getprice() {
		return ProdPrice;
	}
	public void setprice(int price) {
		this.ProdPrice = price;
	}
	@Override
	public String toString() {
		return "Product [ID=" + ProdID + ", Product Name=" + ProdName + ", Product Category=" + ProdCategory + ", Product Price=" + ProdPrice + "]";
	}
	
}

