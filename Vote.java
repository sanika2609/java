import java.util.*;
class Vote{
public static void main(String[] args){
int age;
Scanner sc=new Scanner(System.in);
age=sc.nextInt();
if(age>=18)
{
System.out.print("adult");
}
else
{
System.out.print("Not adult");
}
}
}
