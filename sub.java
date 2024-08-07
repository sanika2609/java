import java.util.*;
public class Main {
   
       public static int SumOfNumbers(int a,int b){
           int sub=a-b;
           return sub;
       }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
           
           int sub=SumOfNumbers(a,b);
           System.out.print(sub);
        }
}

