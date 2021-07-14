class Armstrong
{
public static void main(String args[])
{
int number=153,r,s=0;
int t=number;
while(number>0)
{
r=number%10;
number=number/10;
s=s+r*r*r;
}
if(t==s)
{
System.out.println("Armstrong no");
}
else
{
System.out.println("number is not armstrong no");
}
}
}
