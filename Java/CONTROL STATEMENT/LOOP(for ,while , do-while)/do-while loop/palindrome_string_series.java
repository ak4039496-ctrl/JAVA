// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print palindrome strings from array

public class palindrome_string_series {
    public static void main(String[] args) {
        String arr[] = {"LEVEL", "JAVA", "MOM", "HELLO"};
        int i = 0;
        do {
            String word = arr[i];
            String rev = "";
            int j = word.length() - 1;
            do {
                rev += word.charAt(j);
                j--;
            } while (j >= 0);
            if (rev.equals(word)) {
                System.out.println(word);
            }
            i++;
        } while (i < arr.length);
    }
}
