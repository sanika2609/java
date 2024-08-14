import java.util.*;
 class Perimeter_of_rec{
     public static void main(String[] args){
        int len,br,perimeter;
        Scanner sc=new Scanner(System.in);
        len=sc.nextInt();
        br=sc.nextInt();
        perimeter=2*(len+br);
        System.out.print("Perimeter of rectangle is"+perimeter);
     }

}
