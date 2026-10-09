// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements at odd index

public class array_odd_index {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        System.out.print("Odd Index Elements: ");
        for(int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
