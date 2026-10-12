// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements smaller than product of first two

public class array_smaller_than_first_two_product {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 20, 5};
        int product = arr[0] * arr[1];
        System.out.println("Product of first two => " + product);
        System.out.print("Smaller than product: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < product) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
