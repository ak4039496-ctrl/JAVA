// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print unique elements in array

public class array_unique {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        System.out.println("Unique Elements:");
        for(int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for(int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                System.out.println(arr[i]);
            }
        }
    }
}
