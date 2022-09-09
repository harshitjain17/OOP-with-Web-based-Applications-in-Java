/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice;

/**
 *
 * @author Harshit Jain
 */
public class Account {
    private String name; // instance variable
    private double balance; // instance variable
    
    // constructor initializes name with parameter name
    public Account(String name, double balance) { // constructor name is class name
        this.name = name;
        
        //validate if the balance is greater than 0.0, if it's not
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }
    
    // method to set the name in the object
    public void setName(String name) {
        this.name = name; // store the name
    }
    
    // method to retrieve the name from the object
    public String getName() {
        return name; // return value of name to caller
    }
    
    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
        }
    }
    
    // methd returns the accout balance
    public double getBalance() {
        return balance;
    }
}