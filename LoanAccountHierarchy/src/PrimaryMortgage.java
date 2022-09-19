/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Harshit Jain
 */
public class PrimaryMortgage extends LoanAccountHierarchy{
    private double PMIMonthlyAmount;
    private Address address;
    
    // constructor
    public PrimaryMortgage(double principle, double annualInterestRate, int months, double PMIMonthlyAmount, Address address) {
        super(principle, annualInterestRate, months);
        this.PMIMonthlyAmount = PMIMonthlyAmount;
        this.address = address;
    }

    // displays the information about the PMIMonthlyAmount and Address
    @Override
    public String toString() {
        return "\n\nPrimary Mortgage Loan with:\n" + super.toString() + 
             "\nPMI Monthly Amount: $" + String.format("%.2f", PMIMonthlyAmount) + 
             "\nProperty Address:" + address.toString() + "\n";
    }
}