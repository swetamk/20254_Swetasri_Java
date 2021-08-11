package com.sonata;

public class SumArr {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i: arr) {
			sum=sum+i;
		}
		System.out.println("Sum is "+ sum);

	}

}
