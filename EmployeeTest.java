import java.util.Scanner;
class EmployeeTest
{
public static void main(String[] args)
{
Scanner myObj1=new Scanner(System.in);
System.out.println(x:"Enter first name,last name and salary of the first employee:");
String fn1=myObj1.nextLine();
String ln1=myObj1.nextLine();
double s1=myObj1.nextDouble();
Employee E1=new Employee(fn1,ln1,s1);

Scanner myObj2=new Scanner(System.in);
System.out.println(x:"Enter first name,last name and salary of the second employee:");
String fn2=myObj2.nextLine();
String ln2=myObj2.nextLine();
double s2=myObj2.nextDouble();
Employee E2=new Employee(fn2,ln2,s2);

System.out.println(x:"Details of Employee 1");
String F1=E1.getFName();
String L1=E1.getLName();
double S1=E1.getMsalary();
System.out.println("First Name:"+F1);
System.out.println("Last Name:"+L1);
System.out.println("Monthly salary:"+S1);
System.out.println("Annual salary:"+ (S1*12.0));
E1.Raise();

double R1=E1.getMsalary();
System.out.println("Monthly salary after Raise:"+R1);
System.out.println("Annual salary after Raise:"+(R1*12.0));
E2.Raise();

double R2=E2.getMsalary();
System.out.println("Monthly salary after Raise:"+R2);
System.out.println("Annual salary after Raise:"+(R2*12.0));
}
}
