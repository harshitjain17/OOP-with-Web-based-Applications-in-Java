/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javapractice;

/* @author Harshit Jain */
public class TimeTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create and initialize a Time object
        Time time = new Time(); // invokes Time constructor
        
        // output string representation of the time
        displayTime("After time object is created", time);
        System.out.println();
        
        // change time and output updated time
        time.setTime(13, 27, 6);
        displayTime("After callig setTime", time);
        System.out.println();
        
        // attempt to set time with invalid values
        try {
            time.setTime(99, 99, 99); // all values out of range
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        
        // display time after attempt to set invalid values
        displayTime("After calling setTime with invalid values", time);
    }
    
    // display a Time object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time t) {
        System.out.printf("%s%nUniversal Time: %s%nStandard Time: %s%n", header, t.toUniversalString(), t.toString());
    }

}
