// Author: Amit Gupta
// Date: 18-09-2026
// Program: Delete element at specific position

public class array_delete {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int pos = 2; // index to delete
        int[] newArr = new int[arr.length - 1];
        for(int i = 0, j = 0; i < arr.length; i++) {
            if(i == pos) continue;
            newArr[j++] = arr[i];
        }
        System.out.print("After Delete: ");
        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
