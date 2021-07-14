class Developer
{
void develop()
{
System.out.println("developing");
}
}
class Engineer extends Developer
{
void eng()
{
System.out.println("engineering");
}
}
class Associate extends Engineer
{
void help()
{
System.out.println("helping");
}
}
class MultilevelInheritance
{
public static void main(String args[])
{
Associate a=new Associate();
a.develop();
a.eng();
a.help();
}
}
