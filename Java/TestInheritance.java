class Developer 
{
void develop()
{
System.out.println("developing");
}
}
class Tester extends Developer {
void test()
{
System.out.println("testing");
}
}
class TestInheritance
{
public static void main(String args[])
{
Tester d=new Tester();
d.develop();
d.test();
}
}