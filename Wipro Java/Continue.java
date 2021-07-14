public class Continue{
public static void main(String[] args){
int[] numbers={1,2,3,4,5};
for(int i:numbers){
if(i==3)
{
continue;
}
System.out.print("i:"+i);
}
}
}