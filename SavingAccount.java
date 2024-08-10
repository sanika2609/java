import java.util.Scanner;

class SavingAccount{
    double SavingBalance;
    public static double AnnualInterestRate;

public SavingAccount(double Balance)
{
 this.SavingBalance=Balance;
}
public void calculateMonthlyInterest(){
double MonthlyInterest=(SavingBalance*AnnualInterestRate/12)/100;
SavingBalance += MonthlyInterest;
}
public void printSavingBalance(){
System.out.printf("Saving Balance: Rs %.2f%n",SavingBalance);
}
public static void modifyInterestRate(double newrate)
{
AnnualInterestRate=newrate;
}
public static void main(String[] args)
{
SavingAccount saver1=new SavingAccount(2000.00);
SavingAccount saver2=new SavingAccount(3000.00);
SavingAccount.modifyInterestRate(4.0);
saver1.calculateMonthlyInterest();
saver1.printSavingBalance();
SavingAccount.modifyInterestRate(5.0);
saver2.calculateMonthlyInterest();
saver2.printSavingBalance();
}
}
