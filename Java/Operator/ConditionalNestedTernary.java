/*
Author: Amit Gupta
Date: 08-08-2026
Program: Demonstrate nested ternary operator for grading
*/
public class ConditionalNestedTernary {
    public static void main(String[] args) {
        int marks = 65;
        String grade = (marks >= 90) ? "A+" :
                       (marks >= 75) ? "A" :
                       (marks >= 60) ? "B" : "C";
        System.out.println("Grade => " + grade);
    }
}
