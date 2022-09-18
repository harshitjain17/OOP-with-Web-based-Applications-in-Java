/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice;

/**
 *
 * @author Harshit Jain
 */
public class Week3_ComminsionEmployee extends Object {
    private final String firstName; // 'final' because once the obect is created and these variablesare defined, then we can't change it - no setters
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate;
    
    // five argument constructor
    public Week3_ComminsionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        // implicit call to Object's default constructor occurs here
        
        // if grossSsles is invalid, throw exception
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        
        // if commissionRate is invalid, throw Exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission Rate must be > 0.0 and < 1.0");
        }
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    // return first name
    public String getFirstName() {
        return firstName;
    }
    
    // return last name
    public String getLastName() {
        return lastName;
    }
    
    // return first name
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    // set gross sales amount
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }
    
    // return gross sales amount
    public double getGrossSales() {
        return grossSales;
    }
    
    // set commission rate
    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0.0) {
            throw new IllegalArgumentException("Commission Rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }
    
    // return gross sales amount
    public double getCommissionRate() {
        return commissionRate;
    }
    
    // calculate earnings
    public double earnings() {
        return commissionRate * grossSales;
    }
    
    // return string implementation of CommissionEmployee object
    @Override // indicates that this method overrides a superclass method 
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
            "commission employee", firstName, lastName,
            "social security number", socialSecurityNumber,
            "gross sales", grossSales,
            "commission rate", commissionRate);
    }
}
