class A{
int i;
A(){
System.out.print("Hello");
}
void valueput(){
System.out.print(i);
}
}
class BC extends A
{
public static void main(String args[])
{
BC s=new BC();
s.valueput();
}
}

