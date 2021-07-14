package com.logic;

class A{
	A(){
		System.out.print("hi");  //Default Constructor Ran
	}
        	
}
public class ConstructorLogic extends A {
	ConstructorLogic(int a,int b)
	{
		int c=a+b;
		System.out.print(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ConstructorLogic obj=new ConstructorLogic(4,5);
	}

}
