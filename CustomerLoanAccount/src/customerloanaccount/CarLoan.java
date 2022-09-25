package customerloanaccount;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Harshit Jain
 */
public class CarLoan extends LoanAccountHierarchy {
    private String vehicleVIN;
    
    // constructor
    public CarLoan(double principle, double annualInterestRate, int months, String vehicleVIN) {
        super(principle, annualInterestRate, months); // accepts the three parameters of the LoanAccount class
        this.vehicleVIN = vehicleVIN;
    }

    @Override
    public String toString() {
        return "Car Loan with:\n" + super.toString() + "\nVehicle VIN: " + vehicleVIN;
    }
}
