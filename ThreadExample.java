class MyThread extends Thread{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println("Thread A:"+i);
try
{
Thread.sleep(1000);
}

catch (InterruptedException e)
{
 System.out.println(e);
}

}
}
}
class AnotherThread extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Thread B:"+i);
try
{
Thread.sleep(1000);
}

catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
public class ThreadExample
{
public static void main(String[] args)
{
MyThread threadA=new MyThread();
AnotherThread threadB=new AnotherThread();
threadA.start();
threadB.start();
}
}