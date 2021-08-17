package com.sonata.mob;

import java.util.List;
import java.util.stream.Collectors;

public class Mobile {
	public static void main(String[] args) 
	{
		List<Product> p=Data.getproduct();
		p.stream().filter(p1->p1.getcat()=="Mobile Phone").forEach(System.out::println);
		Product p3=p.stream().max((product1,product2)->product1.getprice()>product2.getprice() ? 1:-1).get();
		System.out.println("Max price is "+p3);
		List < Product >p6 = p.stream()
	            .sorted((o1, o2) -> (int)(o1.getprice() - o2.getprice())).collect(Collectors.toList());
	        System.out.println(p6);
	     List < Product >p7 = p.stream()
		            .sorted((o1, o2) -> (int)(o2.getprice() - o1.getprice())).collect(Collectors.toList());
	     System.out.println(p7);
	        
	}
}


