class A
{
void add(int a,int b)
{
int c;
c=a+b;
System.out.println(c);
}
}
class MethodOverriding extends A
{
void add(int a,int b)
{
int c;
c=a-b;
System.out.println(c);
}
public static void main (String args[])
{
MethodOverriding obj=new MethodOverriding();
obj.add(45,21);

}
}
