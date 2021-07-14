class ThisKeyword{
ThisKeyword(){
this("Java");
System.out.print("DC");
}
ThisKeyword(String str)
{
System.out.print("One Argument Constructor"+str);
}
public static void main(String args[]){
ThisKeyword s1=new ThisKeyword();
}
}