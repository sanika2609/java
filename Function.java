import java.util.*;
class Function{
    public static void Myname(String name){
        System.out.print(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name=sc.nextLine();
        
         Myname(name);
        
    }
}
