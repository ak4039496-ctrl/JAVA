// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements greater than average of first half

public class array_greater_than_first_half_avg {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int mid = arr.length / 2;
        int sum = 0;
        for(int i = 0; i < mid; i++) sum += arr[i];
        double avg = (double)sum / mid;
        System.out.println("First Half Average => " + avg);
        System.out.print("Elements greater than first half average: ");
        for(int i = mid; i < arr.length; i++) {
            if(arr[i] > avg) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
