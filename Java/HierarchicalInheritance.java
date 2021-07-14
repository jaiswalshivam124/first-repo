class Developer
{
void develop()
{
System.out.println("developing");
}
}
class Tester extends Developer
{
void test()
{
System.out.println("testing");
}
}
class Designer extends Developer
{
void design()
{
System.out.println("designing");
}
}
class HierarchicalInheritance
{
public static void main(String args[])
{
Designer d=new Designer();
d.design();
d.develop();
d.test();// cannot be called
}
}