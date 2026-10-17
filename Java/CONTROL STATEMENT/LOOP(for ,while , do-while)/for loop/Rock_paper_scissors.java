/*
Author: Amit Gupta
Date: 05-09-2026
Program: Rock Paper Scissors Game
*/

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.print("Enter your choice (Rock/Paper/Scissors): ");
        String user = sc.nextLine();
        String computer = choices[rand.nextInt(3)];

        System.out.println("Computer chose: " + computer);

        if(user.equalsIgnoreCase(computer)) {
            System.out.println("It's a Draw!");
        } else if((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
                  (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                  (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }

        sc.close();
    }
}
