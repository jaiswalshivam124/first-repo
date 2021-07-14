class Prime
{
public static void main(String args[])
{
int number=29;
boolean isPrime=true;
for(int i=2;i<number/2;i++)
{
if(number%i==0)
{
isPrime=false;
}

}
if(isPrime==false)
{
System.out.println("no is not prime");
}
else
{
System.out.println("no is prime no");
}
}
}