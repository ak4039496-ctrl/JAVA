// Author: Amit Gupta
// Date: 05-10-2026
// Program: Check if a year is leap year 

public class check_leap_year {
    public static void main(String[] args) {
        int year = 2024; // year to check
        int i = year;

        while (i == year) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is Leap Year");
            } else {
                System.out.println(year + " is Not Leap Year");
            }
            break;
        }
    }
}
