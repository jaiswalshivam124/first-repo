package com.logic;

class Boo {
		void display() {
			System.out.print("hello");
		}
	
}
public class OverriddingLogic extends Boo
{
		void display() {
			System.out.print("Boo");
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
				OverriddingLogic obj=new OverriddingLogic();
				obj.display();
				
	}

}
