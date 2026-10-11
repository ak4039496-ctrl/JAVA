// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements smaller than product of first three

public class array_smaller_than_first_three_product {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 20, 30};
        int product = arr[0] * arr[1] * arr[2];
        System.out.println("Product of first three => " + product);
        System.out.print("Smaller than product: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < product) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
