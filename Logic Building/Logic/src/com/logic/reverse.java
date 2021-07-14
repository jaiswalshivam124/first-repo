package com.logic;

import java.util.Scanner;

public class reverse {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		char[] a=new char[len];
		for(int i=0;i<len;i++)
		{
			a[i]=str.charAt(len-i-1);
		}
		for(int j=0;j<len;j++)
		{
			System.out.print(a[j]);
		}
	}

}
