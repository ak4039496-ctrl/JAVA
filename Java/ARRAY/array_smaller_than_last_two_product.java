// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements smaller than product of last two

public class array_smaller_than_last_two_product {
    public static void main(String[] args) {
        int[] arr = {102, 4, 6, 8, 10};
        int product = arr[arr.length - 1] * arr[arr.length - 2];
        System.out.println("Product of last two => " + product);
        System.out.print("Smaller than product: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < product) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
