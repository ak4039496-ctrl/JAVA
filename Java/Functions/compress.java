/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Basic String Compression
*/

import java.util.Scanner;

public class compress {

    // Method to compress string
    static String compressString(String str) {

        String result = "";

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            while (i < str.length() - 1 &&str.charAt(i) ==str.charAt(i + 1)) {

                count++;
                i++;
            }

            result += str.charAt(i);

            result += count;

            count = 1;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println(compressString(str));

        sc.close();
    }
}