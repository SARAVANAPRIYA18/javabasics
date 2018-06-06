package com.basic;

public class SavingsAccount {
static double annualInterestRate;
double savingsBalance;

public void calculateMonthlyInteres() {
	double monthlyInterest=(savingsBalance*(annualInterestRate/100.0))/12;
	savingsBalance=savingsBalance+monthlyInterest;
	System.out.println("The saving balnce is "+savingsBalance);
}
public static void modifyInterestRate (int newValue) {
	annualInterestRate =newValue;
}
public SavingsAccount(double balance) {
	this.savingsBalance=balance;
}
public static void main(String[] args)
{
	SavingsAccount saver1=new SavingsAccount(2000.00);
	SavingsAccount saver2=new SavingsAccount(3000.00);
    SavingsAccount.modifyInterestRate(4);
    saver1.calculateMonthlyInteres();
    saver2.calculateMonthlyInteres();
    SavingsAccount.modifyInterestRate(5);
    saver1.calculateMonthlyInteres();
    saver2.calculateMonthlyInteres();
}
}
