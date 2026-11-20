/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Unit Conversion Using Overloading
*/

public class conversion {

    static double convert(double celsius) {

        return (celsius * 9/5) + 32;
    }

    static double convert(int meter) {

        return meter * 3.28084;
    }

    static double convert(long rupees) {

        return rupees / 83.0;
    }

    public static void main(String[] args) {

        System.out.println(convert(37.0));

        System.out.println(convert(10));

        System.out.println(convert(830L));
    }
}