/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Harshit
 */
public class CourseEntry {
    private String semester;
    private String courseCode;
    private String courseDescription;
    private int seats;

    public CourseEntry(String semester, String courseCode, String courseDescription, int seats) {
        this.semester = semester;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
        this.seats = seats;
    }

    public String getSemester()
    {
        return this.semester;
    }
    public String getCourseCode()
    {
        return this.courseCode;
    }
    public String getCourseDescription()
    {
        return this.courseDescription;
    }
    public int getSeats()
    {
        return this.seats;
    }
}