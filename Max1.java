import java.util.*;
class Max1{
public static void main(String[] args){
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && a>c)
{
System.out.println("Greater number is :"+a);
}
else if(b>a && b>c)
{
System.out.println("Greater number is:"+b);
}
else
{
System.out.print("Greater number is:"+c);
}
}
}
