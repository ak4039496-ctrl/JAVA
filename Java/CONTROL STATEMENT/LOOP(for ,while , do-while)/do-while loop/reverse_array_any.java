// Author: Amit Gupta
// Date: 06-09-2026
// Program: Reverse any array

public class reverse_array_any {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int i = arr.length - 1;
        do {
            System.out.print(arr[i] + " ");
            i--;
        } while (i >= 0);
    }
}
