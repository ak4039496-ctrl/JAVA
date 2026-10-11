// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements smaller than product of first and last

public class array_smaller_than_first_last_product {
    public static void main(String[] args) {
        int[] arr = {2, 4, 26, 8, 10};
        int product = arr[0] * arr[arr.length - 1];
        System.out.println("Product of first and last => " + product);
        System.out.print("Smaller than product: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < product) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
