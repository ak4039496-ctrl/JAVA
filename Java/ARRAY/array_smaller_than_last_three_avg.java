// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements smaller than average of last three

public class array_smaller_than_last_three_avg {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = arr[arr.length - 1] + arr[arr.length - 2] + arr[arr.length - 3];
        double avg = (double)sum / 3;
        System.out.println("Average of last three => " + avg);
        System.out.print("Smaller than average: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < avg) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
