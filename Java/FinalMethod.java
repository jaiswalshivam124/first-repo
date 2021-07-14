class Bike
{
final void run()
{
System.out.println("running");
}
}
class FinalMethod extends Bike
{
void run()
{
System.out.println("running safely with 1000 mph");
}
public static void main(String args[])
{
FinalMethod obj=new FinalMethod();
obj.run();
}
}
