import java.io.*;
class Parent
{
void msg()
{
System.out.println("parent");
}
}
class ExceptionIn extends Parent
{
void msg() throws ArithmeticException
{
System.out.println("Test Exception Child");
}
public static void main(String args[])
{
Parent p=new ExceptionIn();
p.msg();
}
}
