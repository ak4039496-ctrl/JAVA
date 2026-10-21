// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print cubes of numbers from 1 to 10

public class cube_numbers_1_to_10 {
    public static void main(String[] args) {
        int i = 1; //  Initialize counter
        do {
            System.out.println("Cube of " + i + " => " + (i * i * i)); // Print cube
            i++; //  Increment i
        } while (i <= 10); //  Condition check
    }
}
