/*
Author: Amit Gupta
Date: 08-08-2026
Program: Demonstrate nested conditional operator (? :)
*/
public class NestedConditionalOperator {
    public static void main(String[] args) {
        int marks = 82;
        String grade = (marks >= 90) ? "A+" :
                       (marks >= 75) ? "A" :
                       (marks >= 60) ? "B" : "C";
        System.out.println("Grade => " + grade);
    }
}
