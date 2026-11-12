// Author: Amit Gupta
// Date: 09-09-2026
// Program: Swap first and last characters

public class string_swapCharacters {
    public static void main(String[] args) {
        // Declare string
        String text = "hello";

        // Convert to char array
        char[] arr = text.toCharArray();

        //Swap first and last
        char temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        // Print result
        System.out.println("Swapped => " + new String(arr));
    }
}
