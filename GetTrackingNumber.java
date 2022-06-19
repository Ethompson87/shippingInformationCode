import java.util.Random;

public class GetTrackingNumber {
    public void shippingCode(){

        Random r = new Random();
        String shippingCodeNum = "123456789";
        String shippingCodeCharUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shippingCodeCharLower = "abcdefghijklmnopqrstuvwxyz";
        String shippingCodeComplete = shippingCodeNum + shippingCodeCharUpper + shippingCodeCharLower;

        for(int i = 0; i < 20; i++){
            System.out.print(shippingCodeComplete.charAt(r.nextInt(shippingCodeComplete.length())));
        }
    }
}
