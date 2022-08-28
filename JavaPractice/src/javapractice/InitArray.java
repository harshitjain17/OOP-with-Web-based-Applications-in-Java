package javapractice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/* @author Harshit Jain */
public class InitArray {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // declare variable array and initialize it with an array object
        int[] array = new int[10]; // create the array object
        int total = 0;
        
        System.out.printf("%s%8s%n", "Index", "Value"); // column headings
        
        // outpt each array element's value
        for (int counter = 0; counter < array.length; counter++ ) {
            System.out.printf("%3d%8d%n", counter, array[counter]);
            total += array[counter]; // add each element value to total
        }
        
        // printing total
        System.out.printf("Total of array elements: %d", total);
    }

}
