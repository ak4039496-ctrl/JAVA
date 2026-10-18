// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print Armstrong numbers from array

public class armstrong_array_elements {
    public static void main(String[] args) {
        int arr[] = {153, 370, 371, 407, 123};
        int i = 0;
        do {
            int num = arr[i], temp = num, sum = 0;
            do {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            } while (temp > 0);
            if (sum == num) {
                System.out.println(num);
            }
            i++;
        } while (i < arr.length);
    }
}
