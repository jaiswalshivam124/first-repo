package com.logic;
import java.util.*;
public class First {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==0)
        {
        	System.out.print("No is Zero");
        }
        else if(a>0)
        {
        	System.out.print("No is Positive");
        }
        else if(a<0)
        {
        	System.out.print("No is Negative");
        }
	}
}
