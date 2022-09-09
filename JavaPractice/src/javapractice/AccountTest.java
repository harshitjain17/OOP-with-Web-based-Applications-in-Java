/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javapractice;
import java.util.Scanner;

/* @author Harshit Jain */
// this class creates an object of another class - it is a driver class
public class AccountTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        // create an Account object and assign it to myAccount
        Account myAccount = new Account("Jane Green", 50.00);
        
        // display initial value of name (null)
        System.out.printf("Initial Name is: %s%n%n", myAccount.getName());
        
        // prompt for and read name
        System.out.println("Please enter the name: ");
        String theName = input.nextLine(); // read a line of text
        myAccount.setName(theName); // put theName in myAccount
        System.out.println(); // outputs a blank line
        
        // display the name stored in object myAccount
        System.out.printf("Name is object myAccount is: %n%s%n", myAccount.getName());
    }

}
