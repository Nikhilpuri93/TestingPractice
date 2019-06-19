package com.bookshopping.practicesite.Base;

import java.util.Scanner;

public class TestClass {
	
	
	public static void main(String[] args) {
		System.out.println("enter the value of n:");
		int a=0,b=1,c,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+",");
			c=a+b;
			a=b;
			b=c;
			
		}
		
	}
}