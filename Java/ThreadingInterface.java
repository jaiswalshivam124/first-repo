class ThreadingInterface implements Runnable
{
public void run()
{
System.out.println("thread is running");
}
public static void main(String args[])
{
ThreadingInterface m1=new ThreadingInterface();
Thread t1=new Thread(m1);
t1.start();
}
}