interface printable
{
void print();
}

interface showable
{
void show();
}

class MultipleInheritance implements printable,showable
{
public void print()
{
System.out.println("Hello");
}
public void show()
{
System.out.println("Shivam");
}
public static void main(String args[])
{
MultipleInheritance obj=new MultipleInheritance();
obj.print();
obj.show();
}
}