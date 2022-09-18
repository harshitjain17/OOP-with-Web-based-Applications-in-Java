/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javapractice;
import java.util.Scanner; // program uses class Scanner

/* @author Harshit Jain */
public class AddingTwoNumbers {
    /**
     * @param args the command line arguments
     */
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        int number1; // first number to add
        int number2; // second number to add
        int sum; // sum of number1 and number2
        
        System.out.print("Enter first number: "); // prompt
        number1 = input.nextInt(); // reads first number from user
        
        System.out.print("Enter second number: "); // prompt
        number2 = input.nextInt(); // reads second number from user
        
        sum = number1 + number2; // initiating sum
        System.out.printf("The sum is: %d", sum);        
    }
  
}