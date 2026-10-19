// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find average of array elements

public class average_of_array {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int i = 0, sum = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);
        double avg = (double) sum / arr.length;
        System.out.println("Average => " + avg);
    }
}
