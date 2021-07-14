import java.util.*;
class FibonacciSeries
{
void Fibonacci(int number)
{
int next=0,f=0,s=1;

for(int i=0;i<number;i++)
{
if(i<=1)
{
next=i;
}
else
{
next=f+s;
f=s;
s=next;
}
System.out.println(next);
}
}
public static void main(String args[])
{
int number;
System.out.println("Enter the no of terms");
Scanner sc=new Scanner(System.in);
number=sc.nextInt();
FibonacciSeries obj=new FibonacciSeries();
obj.Fibonacci(number);


}
}
