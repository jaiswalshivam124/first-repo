class Animal
{
String color="White";
}
class Dog extends Animal
{
String color="black";
void printColor()
{
System.out.println(color);
System.out.println(super.color);
}
}
class SuperTesting
{
public static void main(String args[])
{
Dog d=new Dog();
d.printColor();
}
}
