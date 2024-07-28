import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a,b,sum,sub,mul,div,rem;
        a=sc.nextFloat();
        b=sc.nextFloat();
        
        sum=a+b;
        System.out.println(sum);
        
        sub=a-b;
        System.out.println(sub);
        
        mul=a*b;
        System.out.println(mul);
        
        div=a/b;
        System.out.println(div);
        
        rem=a%b;
        System.out.print(rem);
    
    }
}
