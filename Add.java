import java.io.*;
class Add{
   public static void main(String[] args)throws  IOException{
      int a, b, sum;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter First Number");
      a=Integer.parseInt(br.readLine());
      System.out.println("Enter Second Number");
      b=Integer.parseInt(br.readLine());
      sum=a+b;
      System.out.print("Addition="+sum);

   }

}
