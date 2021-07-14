package com.logic;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int b=sc1.nextInt();
        if((a+b)%2==0)
        {
        System.out.print("No is Even");
        }
        else
        {
        	System.out.print("No is odd");
        }
	}

}
