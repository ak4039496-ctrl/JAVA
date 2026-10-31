// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print prime numbers from array

public class prime_array_elements {
    public static void main(String[] args) {
        int arr[] = {11, 22, 31, 44, 53};
        int i = 0;
        do {
            int num = arr[i];
            boolean prime = true;
            int j = 2;
            do {
                if (num % j == 0) {
                    prime = false;
                    break;
                }
                j++;
            } while (j <= num / 2);
            if (prime && num > 1) {
                System.out.println(num);
            }
            i++;
        } while (i < arr.length);
    }
}
