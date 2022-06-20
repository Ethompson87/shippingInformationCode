/*
Author: Eric Thompson
Purpose of Program: Creating Shipping tracking codes
Date Created: June 20, 2022
*/

import java.util.Random;

public class GetTrackingNumber {
    public void shippingCode() {

        Random rand = new Random();
        String shippingCodeNum = "0123456789"; // 0-9 numbers
        String shippingCodeCharUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // A-Z upper case String
        String shippingCodeCharLower = "abcdefghijklmnopqrstuvwxyz"; // a-z lower case String
        String shippingCode = shippingCodeNum + shippingCodeCharUpper + shippingCodeCharLower; // Insert shippingCodeNum, shippingCodeCharUpper, and shippingCodeCharLower together

        for (int i = 0; i < 20; i++) {

            System.out.print(shippingCode.charAt(rand.nextInt(shippingCode.length()))); // run a random number or character twenty times in a for loop
        }
    }
}
