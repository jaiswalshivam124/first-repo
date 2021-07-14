interface kickable
{
void print();
}
class InterfaceTesting implements kickable
{
public void print()
{
System.out.println("Hello");
}
public static void main(String args[])
{
InterfaceTesting obj=new InterfaceTesting();
obj.print();
}
}