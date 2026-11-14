/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Words Using Method
*/

import java.util.Scanner;

public class count_word {

    // Method to count words
    static int countWords(String str) {

        String[] words =str.trim().split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sentence: ");
        String str = sc.nextLine();

        System.out.println("Words => "+ countWords(str));

        sc.close();
    }
}