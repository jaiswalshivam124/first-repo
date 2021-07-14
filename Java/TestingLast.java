class An
{
void add(int a,int b)
{
int c;
c=a+b;
System.out.println(c);
}
}
class TestingLast extends An
{
void add(int a,int b)
{
int c;
c=a-b;
System.out.println(c);
}
public static void main(String args[])
{
An obj=new TestingLast();
obj.add(5,10);
}
}
