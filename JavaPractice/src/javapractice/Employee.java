/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice;

/**
 *
 * @author Harshit Jain
 */
public class Employee {
    private static int count = 0; //no. of employees created - static bcz we only want one copy of that (it becomes a class attribute)
    private final String firstName;
    private final String lastName;
    
    // nitialize Employee, add 1 to static count, and output String indicating that constructor was called
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        ++count; // increment static count of employees
        System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
    }
    
    // getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public static int getCount() { // static method to get static count value
        return count;
    }
}
