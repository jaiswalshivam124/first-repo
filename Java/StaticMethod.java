class StaticMethod
{
int rollno;
String name;
static String college="mmmtu";
static void change()
{
college="NIELIT";
}
StaticMethod (int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno + " " + name + " " + college);
}
public static void main(String args[])
{
StaticMethod.change();
StaticMethod s1= new StaticMethod(121,"shgdhk");
StaticMethod s2= new StaticMethod(12,"sdk");
StaticMethod s3= new StaticMethod(1,"s");
s1.display();
s2.display();
s3.display();
}
}
