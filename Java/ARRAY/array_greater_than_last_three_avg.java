// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements greater than average of last three

public class array_greater_than_last_three_avg {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = arr[arr.length - 1] + arr[arr.length - 2] + arr[arr.length - 3];
        double avg = (double)sum / 3;
        System.out.println("Average of last three => " + avg);
        System.out.print("Greater than average: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > avg) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
