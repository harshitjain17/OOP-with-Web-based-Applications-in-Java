/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class LoanAccountHierarchy {
    private double principle; // the original amount of the loan
    private double annualInterestRate; // the annual interest rate
    private int months; // the number of months in the term of the loan
    
    // constructor
    public LoanAccountHierarchy(double principle, double annualInterestRate, int months) {
        this.principle = principle;
        this.annualInterestRate = annualInterestRate;
        this.months = months;
    }
    
    // return principle
    public double getPrinciple() {
        return principle;
    }
    
    // return annual interest rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    // return months
    public int getMonths() {
        return months;
    }
    // calculates the monthly payment
    public double calculateMonthlyPayment() {
        double monthlyInterest = getAnnualInterestRate()/12;
        double monthlyPayment = getPrinciple() * ( monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -1 * getMonths())));
        return monthlyPayment;
    }
    
    // return string implementation of LoanAccountHierarchy class
    @Override // indicates that this method overrides a superclass method 
    public String toString() {
        return String.format("%s: $%.2f%n%s: %.2f %n%s%d%n%s%.2f",
                "Principle: $", getPrinciple(),
                "Annual Interest Rate", getAnnualInterestRate(),
                "Term of Loan in Months", getMonths(),  
                "Monthly Payment", calculateMonthlyPayment());
    }
}
