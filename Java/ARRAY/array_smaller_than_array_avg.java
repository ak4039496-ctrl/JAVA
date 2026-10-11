// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements smaller than average of array

public class array_smaller_than_array_avg {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) sum += arr[i];
        double avg = (double)sum / arr.length;
        System.out.println("Average = " + avg);
        System.out.print("Smaller than average: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < avg) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
