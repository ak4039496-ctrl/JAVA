// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements smaller than average of last two

public class array_smaller_than_last_two_avg {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        double avg = (arr[arr.length - 1] + arr[arr.length - 2]) / 2.0;
        System.out.println("Average of last two => " + avg);
        System.out.print("Smaller than average: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < avg) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
