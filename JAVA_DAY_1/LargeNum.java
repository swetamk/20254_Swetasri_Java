package com.sonata;

import java.util.Arrays;

public class LargeNum {

	public static void main(String[] args) {
		int[] arr = {3,2,0,4,8,4,9,8};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
        System.out.println(arr[arr.length-1]);

	}

}