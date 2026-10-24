// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print alternate odd numbers up to 20 

public class print_alternate_odd_numbers {
    public static void main(String[] args) {
        int i = 1;
        boolean skip = false;

        while (i <= 20) {
            if (!skip) {
                System.out.println(i);
            }
            skip = !skip; // toggle skip
            i += 2;
        }
    }
}
