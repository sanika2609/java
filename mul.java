import java.util.*;
public class Main {
   
       public static int MulOfNumbers(int a,int b){
           int mul=a*b;
           return mul;
       }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
           
           int mul=MulOfNumbers(a,b);
           System.out.print(mul);
        }
}
