class Palindrome
{
public static void main(String args[])
{
int number=156,r,s=0;
int t=number;
while(number>0)
{
r=number%10;
number=number/10;
s=s*10+r;
}
if(t==s)
{
System.out.println("Palindrome no");
}
else
{
System.out.println("Not a Palindrome no");
}
}
}