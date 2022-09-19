/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;
    
    // constructor
    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    
    // get street
    public String getStreet() {
        return this.street;
    }
    
    // get city
    public String getCity() {
        return this.city;
    }
    
    // get state
    public String getState() {
        return this.state;
    }
    
    // get zip code
    public String getZipcode() {
        return this.zipcode;
    }

    @Override
    public String toString() {
        return "\n    " + street + "\n" +
               "    " + city + ", " + state + " " + zipcode + "\n";
    }
}
