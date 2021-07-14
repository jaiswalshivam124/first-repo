class A{
int m,n;
void display1(){
System.out.print("m and n are:"+m+" "+n);
}
}
class B extends A{
int c;
void display2(){
System.out.print("c:"+c);
}
void sum(){
System.out.print("m+n+c="+(m+n+c));
}
}
class InheritanceDemo{
public static void main(String args[]){
A s1=new A();
B s2=new B();
s1.m=10;s1.n=20;
System.out.print("State of Object A:");
s1.display1();
s2.m=7;s2.n=8;s2.c=9;
System.out.print("State of Object B:");
s2.display1();
s2.display2();
System.out.print("sum of m,n,c in Object B is:");
s2.sum();
}
}

