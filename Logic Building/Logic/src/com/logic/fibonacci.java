package com.logic;

import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int f=sc.nextInt();
		int s=sc.nextInt();
		int n=sc.nextInt();
		int i=1;
		int next=0;
		while(i<=1)
		{
			System.out.print(f);
			System.out.print(s);
			i++;
		}
//		int k = 0;
//	    while (k < 5) {
//	      System.out.println(i);
//	      k++;
//	    }
//		while (n < 16)
//		{
//			System.out.print("hello");
//			n++;
//		}
//		System.out.print(n);
		while(n<=15)
		{
			next=f+s;
			f=s;
			s=next;
			System.out.print(next);
			n++;
		}
	}

}
