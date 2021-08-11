package com.sonata;


public class GreatestNum {

		static int largest(int a, int b, int c) {
			if(a >= b && a>=c) {
				return a;
			}
			else if(b>=a && b>=c) {
				return b;
			}
			else {
				return c;
			}
		}

		public static void main(String[] args) {
			int a,b,c, greatest;
			a=12; b=25; c=89;
			greatest= largest(a,b,c);
			System.out.println(greatest);

	}

}
