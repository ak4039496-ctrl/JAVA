// Author: Amit Gupta
// Date: 18-09-2026
// Program: Find second smallest element in array

public class array_second_smallest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 89};
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest) {
                second = smallest; // purana smallest save
                smallest = arr[i]; // ab naya smallest asine
            } else if(arr[i] < second && arr[i] != smallest) {
                second = arr[i];
            }
        }
        System.out.println("Second Smallest => " + second);
    }
}
