class StaticVariable
{
static int a=0;
StaticVariable()
{
a++;
System.out.println(a);
}
public static void main(String args[])
{
StaticVariable obj=new StaticVariable();
StaticVariable obj1=new StaticVariable();
StaticVariable obj2=new StaticVariable();
}
}
