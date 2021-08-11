package com.sonata;

public class ArrVal {
	public static void check(int[] arr, int toCheckVal) {
		boolean test= false;
		for(int element: arr) {
			if(element == toCheckVal) {
				test= true;
				break;
			}
		}
		System.out.println(test);
	}

	public static void main(String[] args) {
		int arr[]= {5,1,6,3,8,4};
		int toCheckVal=7;
		check(arr, toCheckVal);
	}
}
