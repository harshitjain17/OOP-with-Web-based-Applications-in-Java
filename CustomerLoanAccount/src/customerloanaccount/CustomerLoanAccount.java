/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package customerloanaccount;

import java.util.ArrayList;

/* @author Harshit Jain */
public class CustomerLoanAccount {
    private String firstName;
    private String lastName;
    private String SSN;
    private ArrayList<LoanAccountHierarchy> loanAccounts;
    
    // constructor
    public CustomerLoanAccount (String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        loanAccounts = new ArrayList<LoanAccountHierarchy>();
    }
    
    // get firstName
    public String getFirstName() {
       return firstName;
    }
    
    // get lastName
    public String getLastName() {
       return lastName;
    }
    
    // get SSN
    public String getSSN() {
       return SSN;
    }
    
    // adds a loan to the array list of loans for this customer
    public void addLoanAccount(LoanAccountHierarchy account) {
        loanAccounts.add(account);
    }
    
    // prints all the information for all the accounts of this Customer
    public String printMonthlyReport() {
        String report = "Account Report for Customer: " + firstName + " " + lastName + " with SSN " + SSN + "\n";
        for (LoanAccountHierarchy account : loanAccounts) {
            report += account.toString();
        }
        return report;
    }
}   
