import java.util.Scanner;
class Calculator{
public static void main(String[] args){
int a,b;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a:");
a=sc.nextInt();
System.out.print("Enter b:");
b=sc.nextInt();
System.out.print("Enter your choise");
int ch=sc.nextInt();
if(ch==1)
{
System.out.print("Addition of the two numbers is:"+(a+b));
}
else if(ch==2)
{
System.out.println("Substraction of the two numbers is:"+(a-b));
}
else if(ch==3)
{
System.out.println("Multipliction of the two numbers is:"+(a*b));
}
else if(ch==4)
{
System.out.print("Division of the two numbers is:"+(a/b));
}
else
{
System.out.print("Invalid choise");
}
}
}
