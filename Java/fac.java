import java.util.*;
class Fact
{
static
{
System.out.println("enter the no");
}
}
class fac
{
public static void main(String args[])
{
int c=1;
Fact ob=new Fact();
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int n=1;n<=a;n++)
{
c=c*n;
}
System.out.println(c);
}
}