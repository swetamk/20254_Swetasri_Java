package com.sonata;

public class Duplicate {

	public static void main(String[] args) {
			int a[]= {1,0,3,6,3,4,5,9,3};
			for(int i=1;i<a.length;i++)
			{
				int x=0;
				for(int j=0;j<=i;j++)
				{
					if(a[i]==a[j])
					{
						x=x+1;
					}
				}
				if(x==2)
				{
					System.out.print(a[i]+" ");
				}
			}
		}

	}