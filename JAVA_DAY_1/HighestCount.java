package com.sonata;

public class HighestCount {

	public static void main(String[] args) {
		int a[]= {6,1,4,4,2,3,3,4,3,3,7,7};
		int max=0;
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
			if(x>max)
			{
				max=x;
			}
		}
		System.out.print(max);

	}

}
