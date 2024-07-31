import java.util.*;
public class Condition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         int b=sc.nextInt();
        if(a==b)
        {
            System.out.println("Equal");
        }
        else
        {
            if(a>b)
            {
                System.out.println("a is greter then b");
            }
            else
            {
            System.out.print("a is lesser then b");
            }
        }
    }
} 
