/*
Author: Amit Gupta
Date: 09-10-2026
Program: Check if a number is Fascinating
*/

public class Check_fascinating_number {
    public static void main(String[] args) {
        int num = 192;
        String str = num + "" + (num*2) + "" + (num*3);

        boolean containsAll = true;
        for(char c = '1'; c <= '9'; c++) {
            if(!str.contains(String.valueOf(c))) {
                containsAll = false;
                break;
            }
        }

        if(containsAll) {
            System.out.println(num + " is Fascinating number"); // 123456789 check
        } else {
            System.out.println(num + " is Not Fascinating number");
        }
    }
}
