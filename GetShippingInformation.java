/*
Author: Eric Thompson
Purpose of Program: Creating Shipping information by entering data
Date Created: June 20, 2022
*/

public class GetShippingInformation {

    //variables
    protected String fullName; // first and last name
    protected String address; // street address
    protected String city; // city
    protected String state; // state
    protected String zipcode; // zipcode

    //constructor GetShippingInformation
    public GetShippingInformation(String newFullName, String newAddress, String newCity, String newState, String newZipCode){
        this.fullName = newFullName;
        this.address = newAddress;
        this.city = newCity;
        this.state = newState;
        this.zipcode = newZipCode;
    }
}