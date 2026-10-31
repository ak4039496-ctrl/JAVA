// Author: Amit Gupta
// Date: 06-09-2026
// Program: Reverse each string in array

public class reverse_string_array {
    public static void main(String[] args) {
        String arr[] = {"JAVA", "HELLO", "WORLD"};
        int i = 0;
        do {
            String str = arr[i];
            String rev = "";
            int j = str.length() - 1;
            do {
                rev += str.charAt(j);
                j--;
            } while (j >= 0);
            System.out.println("Reverse of " + str + " => " + rev);
            i++;
        } while (i < arr.length);
    }
}
