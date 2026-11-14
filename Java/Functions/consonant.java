/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Consonants Using Method
 */

import java.util.Scanner;

public class consonant {

    // Method to count consonants
    static int countConsonants(String str) {

        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Consonants => "+ countConsonants(str));

        sc.close();
    }
}
