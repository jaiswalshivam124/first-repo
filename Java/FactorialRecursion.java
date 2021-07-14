class FactorialRecursion 
{
public static int fac(int n)
{
if(n>0)
{
return (n*fac(n-1));
}
else
{
return (1);
}
}
public static void main(String args[])
{
int result;
FactorialRecursion obj=new FactorialRecursion();
result=obj.fac(5);
System.out.println(result);
}
}
