import java.util.Scanner;  
public class FibonacciSeries   
{  
  
// main method  
public static void main(String argvs[])   
{  
Scanner scnr = new Scanner(System.in);  
int N = scnr.nextInt();  
  
int first = 0; // first fibonacci number  
int second = 1; // second fibonacci number  
  
// handling the corner cases when the N is 0 or negative. Note that we are treating this   
// series with 1-indexing.   
if(N <= 0)   
{  
System.out.println("N can never be zero or negative");  
return;  
}  
  
// if the user input is either 1 or 2  
if(N == 1)   
{  
System.out.println(first);  
}  
else if(N == 2)   
{  
System.out.println(second);  
}  
else   
{  
// loop for the Nth fibonacci numbers  
int curr = 0;  
for(int j = 3; j <= N; j++)   
{  
curr = first + second;  
first = second;  
second = curr;  
}  
  
System.out.println("The " + N + "th Fibonacci number is: " + curr);  
}  
    
}  
}  
