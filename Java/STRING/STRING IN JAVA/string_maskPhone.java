// Author: Amit Gupta
// Date: 09-09-2026
// Program: Mask phone number

public class string_maskPhone {
    public static void main(String[] args) {
        //  Declare phone number
        String phone = "9876543210";

        // Mask all except last 4 digits
        String masked = "******" + phone.substring(phone.length()-4);

        //Print result
        System.out.println("Masked phone => " + masked);
    }
}
