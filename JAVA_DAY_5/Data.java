package com.sonata.mob;

import java.util.ArrayList;
import java.util.List;
public class Data 
{
	public static List<Product> getproduct(){
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"Apple","iPhone",50000));
		list.add(new Product(3,"Reebok","Shoes",7000));
		list.add(new Product(2,"Samsung","Mobile",14000));
		list.add(new Product(4,"Zara","Clothing",2400));
		return list;
	}
}