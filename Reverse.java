import java.util.Scanner;
class Reverse{
public static void main(String[] args){
int n,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of n");
n=sc.nextInt();
while(n>0){
rev=(rev*10)+(n%10);
n=n/10;
}
System.out.println("Reverse of n is:"+rev);
}
}
