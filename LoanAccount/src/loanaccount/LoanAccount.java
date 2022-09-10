/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package loanaccount;

/* @author Harshit Jain */
public class LoanAccount {
    private static double annualInterestRate;
    private final double principle;
    
    public LoanAccount(double principle) {
        this.principle = principle;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoanAccount loan1 = new LoanAccount(5000.00);
        LoanAccount loan2 = new LoanAccount(31000.00);
        
        System.out.println("Monthly payments for loan1 of $5000.00 and loan2 $31000.00 for 3, 5 and 6 years loans at 1% interest.");
        
        LoanAccount.setAnnualInterestRate(0.01);
        double a1 = loan1.calculateMonthlyPayment(36);
        double b1 = loan1.calculateMonthlyPayment(60);
        double c1 = loan1.calculateMonthlyPayment(72);
        double a2 = loan2.calculateMonthlyPayment(36);
        double b2 = loan2.calculateMonthlyPayment(60);
        double c2 = loan2.calculateMonthlyPayment(72);
        
        System.out.println("Loan    3 years  5 years  6 years");
        System.out.printf("Loan1    %.2f    %.2f    %.2f%n", a1, b1, c1);
        System.out.printf("Loan2    %.2f    %.2f    %.2f%n", a2, b2, c2);
        
        System.out.println("Monthly payments for loan1 of $5000.00 and loan2 $31000.00 for 3, 5 and 6 years loans at 5% interest.");
        
        LoanAccount.setAnnualInterestRate(0.05);
        double A1 = loan1.calculateMonthlyPayment(36);
        double B1 = loan1.calculateMonthlyPayment(60);
        double C1 = loan1.calculateMonthlyPayment(72);
        double A2 = loan2.calculateMonthlyPayment(36);
        double B2 = loan2.calculateMonthlyPayment(60);
        double C2 = loan2.calculateMonthlyPayment(72);
        
        System.out.println("Loan    3 years  5 years  6 years");
        System.out.printf("Loan1   %.2f  %.2f  %.2f%n", A1, B1, C1);
        System.out.printf("Loan2   %.2f  %.2f  %.2f%n", A2, B2, C2);
   }
    
    public double calculateMonthlyPayment(int numberOfPayments) {
        double monthlyInterest = annualInterestRate/12;
        double monthlyPayment = principle * ( monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -numberOfPayments)));
        return monthlyPayment;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        LoanAccount.annualInterestRate = annualInterestRate;
    }
    
    
    
}
