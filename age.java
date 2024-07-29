import java.util.*;
public class Condition{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        
        if(age>=18){
            System.out.println("Person is adult");
        }
        else
        {
            System.out.print("Person is not adult");
        }
    }
}
