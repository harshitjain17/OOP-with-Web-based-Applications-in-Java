/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice;

/**
 *
 * @author Harshit Jain
 */
public class Time {
    private int hour; // 0-23
    private int minute; // 0-59
    private int second; // 0-59
    
    // set a new time using universal time; throw the exception if they are invalid
    public void setTime(int hour, int minute, int second) {
        if (hour > 24 || minute > 59 || second > 59 || hour < 0 || minute < 0 || second < 0) { // validate 
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    // get methods
    public int getHour() {return hour;}
    public int getMinute() {return minute;}
    public int getSecond() {return second;}
    
    // convert to String in unversal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    
    // convert to String in standard-time format (H:MM:SS AM or PM)
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",
            ((getHour()==0 || getHour()==12) ? 12 : getHour()%12), getMinute(), getSecond(), (getHour()<12 ? "AM" : "PM"));
    }
}
