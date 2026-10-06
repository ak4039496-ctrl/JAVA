// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements greater than average of first two

public class array_greater_than_first_two_avg {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        double avg = (arr[0] + arr[1]) / 2.0;
        System.out.println("Average of first two => " + avg);
        System.out.print("Greater than average: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > avg) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
