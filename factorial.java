import java.util.*;
class Function{
    public static void printfactorial(int n){
    int factorial=1;
    for(int i=n;i>=1;i--){
        factorial=factorial*i;
    }
      System.out.print(factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printfactorial(n);
        
    }
}
