import java.util.*;
 public class Main{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number");
         int num=sc.nextInt();
         int i=1,fact=i;
         while(i<=num){
             fact=fact*i;
             i++;
         }
         System.out.println(fact);
     }
 }
