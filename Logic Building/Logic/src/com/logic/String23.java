package com.logic;

public class String23 {

	public static void main(String args[]) {
	String str1 = "ABABAABBBABAAABBABABBB";
	int countA=0;
	int countB=0;
	int leng = str1.length();
	for(int i=0;i<leng;i++)
	{
		char ab=str1.charAt(i);
		if(ab=='A')
		{
			countA=countA+1;
		}
		else
		{
			countB=countB+1;
		}
		}
	System.out.println(countA+" "+countB);
			for(int j = 0;j<countA;j++)
			{
			System.out.print("A");
			}
			System.out.print(" ");
			for(int j = 0;j<countB;j++)
			{
			System.out.print("B");
			}
	}
}
