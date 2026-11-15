/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Duplicate Characters
 */

import java.util.Scanner;

public class duplicate {

    // Method to display duplicates
    static void findDuplicate(String str) {

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            int count = 1;

            for (int j = i + 1;j < str.length(); j++) {

                if (str.charAt(i)== str.charAt(j)) {

                    count++;
                }
            }

            if (count > 1) {
                System.out.println(str.charAt(i) + " => " + count);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        findDuplicate(str);

        sc.close();
    }
}
