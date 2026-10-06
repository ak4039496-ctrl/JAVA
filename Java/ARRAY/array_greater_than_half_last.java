// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements greater than half of last element

public class array_greater_than_half_last {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int value = arr[arr.length - 1] / 2;
        System.out.println("Half of last => " + value);
        System.out.print("Greater than half: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > value) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
