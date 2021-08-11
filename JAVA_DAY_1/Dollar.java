package com.sonata;

public class Dollar {

	public static void main(String[] args) {
		String string = "hi my name is sweta";
		char a[] = string.toCharArray(); 
		for (int i = 0; i < a.length; i++)
        {
               if (a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
               {
                a[i]='$';
               }   
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
		
		

	}

}