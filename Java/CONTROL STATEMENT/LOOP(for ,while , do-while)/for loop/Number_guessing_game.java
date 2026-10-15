/*
Author: Amit Gupta
Date: 05-09-2026
Program: Number Guessing Game
*/

import java.util.Scanner;
import java.util.Random;

public class Number_guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // random 1–100
        int guess;

        System.out.println("Guess a number between 1 and 100:");
        do {
            guess = sc.nextInt();
            if(guess > number) System.out.println("Too High!");
            else if(guess < number) System.out.println("Too Low!");
            else System.out.println("Correct! You guessed it.");
        } while(guess != number);

        sc.close();
    }
}
