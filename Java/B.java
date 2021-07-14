class A {
	A(int a)
	{
		System.out.println("A");
	}
}

class B extends A
{
	B(int a)
	{
                super(10);
		System.out.println("B");
	}
		public static void main(String a[])
		{
               
		B obj=new B(5);
		}
}
