// Author: Amit Gupta
// Date: 19-09-2026
// Program: Check if array is palindrome

public class array_palindrome {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        boolean palindrome = true;
        for(int i = 0; i < arr.length/2; i++) {
            if(arr[i] != arr[arr.length - 1 - i]) { // left aur right index cheak
                palindrome = false; 
                break;
            }
        }
        if(palindrome) {
            System.out.println("Array is palindrome");
        } else {
            System.out.println("Array is not palindrome");
        }
    }
}
