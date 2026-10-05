// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements greater than given value

public class array_greater_than {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 5, 40};
        int value = 20;
        System.out.println("Elements greater than " + value + ":");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > value) {
                System.out.println(arr[i]);
            }
        }
    }
}
