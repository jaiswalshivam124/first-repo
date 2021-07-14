package com.logic;

public class OverloadingLogic {
// Different Return type means different method
//	void display(int a, String b, int c) {
//		System.out.print(a+b+c);
//	}
    int display(int a, String b, int c) {
		System.out.print(a+b+c);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingLogic obj=new OverloadingLogic();
		obj.display(12,"heelo",56);
	}

}
