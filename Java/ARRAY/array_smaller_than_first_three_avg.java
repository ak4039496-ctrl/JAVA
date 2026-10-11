// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements smaller than average of first three

public class array_smaller_than_first_three_avg {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = arr[0] + arr[1] + arr[2];
        double avg = (double)sum / 3;
        System.out.println("Average of first three => " + avg);
        System.out.print("Smaller than average: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < avg) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
