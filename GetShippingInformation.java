/*
Author: Eric Thompson
Purpose of Program: Creating Shipping information by entering data
Date Created: June 20, 2022
*/

import java.util.Scanner;

public class GetShippingInformation {

    Scanner scan =  new Scanner(System.in);

    //variables
    protected String fullName; // first and last name
    protected String address; // street address
    protected String city; // city
    protected String state; // state
    protected String zipcode; // zipcode

    //constructor GetShippingInformation
    public GetShippingInformation(String fullName, String address, String city, String state, String zipcode){
        this.fullName = fullName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
}
