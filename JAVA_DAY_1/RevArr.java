package com.sonata;

public class RevArr {

	public static void main(String[] args) {
		Integer[] intArr= {10,20,30,40,50,60};
		System.out.println("Original Array: ");
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]+ " ");
		}		
		System.out.println("Reversed array: ");
		for(int i=intArr.length-1;i>=0;i--) {
			System.out.println(intArr[i]+" ");
		}
	}
}
