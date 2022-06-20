/*
Name: Eric Thompson
Purpose: Main class that creates the objects and prints the results
Date Created: June 20, 2022
*/

public class displayShippingInformation {
    public static void main(String[] args) {

        GetTrackingNumber trackingNum = new GetTrackingNumber(); // Object
        GetShippingInformation information = new GetShippingInformation("Bob Steller", "4562 Somewhere lane", "theCity", "theState", "Thezipcode"); //Object and Constructor arguments

        System.out.println("Full Name: " + information.fullName);// print fullname
        System.out.println("Address" + information.address);// print address
        System.out.println("City: " + information.city); // print city
        System.out.println("State: " + information.state); // print state
        System.out.println("ZipCode: " + information.zipcode); // print zipcode
        System.out.print("Shipping Code: ");
        trackingNum.shippingCode();

    }
}
