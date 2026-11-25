/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Array Elements Using Recursion
*/

public class arr_count {

    // Recursive method
    static int countElements(int[] arr,int index) {

        // Base case
        if (index == arr.length) {
            return 0;
        }

        // Recursive count
        return 1 +countElements(arr,index + 1);
    }

    public static void main(String[] args) {

        int[] arr ={10, 20, 30, 40, 50};

        System.out.println("Count = "+ countElements(arr,0));
    }
}