/*
Author: Amit Gupta
Date: 05-09-2026
Program: Simple Hash Generator (ASCII sum)
*/

public class Hash_generator {
    public static void main(String[] args) {
        String data = "Amit123";
        int hash = 0;

        for(char c : data.toCharArray()) { // Take each character of the data one by one and store it in
            hash += c;
        }

        System.out.println("Data: " + data);
        System.out.println("Generated Hash: " + hash);
    }
}
