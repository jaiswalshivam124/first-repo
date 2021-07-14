final class Hello
{
void me()
{
System.out.println("Hello");
}
}
class FinalClass extends Hello
{
public static void main(String args[])
{
FinalClass obj=new FinalClass();
obj.me();
}
}
