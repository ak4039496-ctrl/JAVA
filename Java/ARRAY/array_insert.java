// Author: Amit Gupta
// Date: 19-09-2026
// Program: Insert element at specific position

public class array_insert {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int pos = 2; // index position
        int element = 3;
        int[] newArr = new int[arr.length + 1];
        for(int i = 0, j = 0; i < newArr.length; i++) { // j means old index possition
            if(i == pos) {                      // i means newaarray index possition
                newArr[i] = element; 
            } else {
                newArr[i] = arr[j++];
            }
        }
        System.out.print("After Insert: ");
        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
