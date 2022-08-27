/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice;

/**
 *
 * @author Harshit Jain
 */
public class GradeBook {
    private String courseName; // course name for this grade book
    
    // constructor initializes courseName with String argument
    public GradeBook( String name ) {
        courseName = name; // initializes courseName
    }
    
    // setter method to set the courseName
    public void setCourseName( String name ) {
        courseName = name; // store the course name
    }
    
    // getter method to get the courseName
    public String getCourseName() {
        return courseName; // retrieve the course name
    }
    
    // display a welcome message to the GradeBook user
    public void displayMessage () {
        System.out.printf( "Welcome to the gradebook for %s", getCourseName() );
    }
}
