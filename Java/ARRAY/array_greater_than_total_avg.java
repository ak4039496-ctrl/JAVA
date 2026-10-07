// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements greater than average of all elements

public class array_greater_than_total_avg {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) sum += arr[i];
        double avg = (double)sum / arr.length;
        System.out.println("Total Average => " + avg);
        System.out.print("Greater than average: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > avg) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
