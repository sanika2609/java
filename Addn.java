import java.util.Scanner;
class Addn{
    public static void main(String[] args){
        int n,i,add=0;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the value of n");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            add=add+i;
            i++;
        }
        System.out.print("Addition of n numbers is:"+add);

    }
}
