import java.util.*;
class A{
    int a,b;
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
    
    }
    void add()
    {
        System.out.println("Addition"+(a+b));
    }
    
}
class B extends A
{
    int c;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        c=sc.nextInt();
    }
    void display()
    {
        System.out.println("Addition:"+(a+b+c));
    }
}
class demo
{
    public static void main(String args[]){
        B aa=new B();
        aa.input();
        aa.getdata();
        aa.add();
        aa.display();
    }
}
