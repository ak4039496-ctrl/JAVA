/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Mini Project Report Using Method Overloading
*/

public class project {

    static void report(String name) {

        System.out.println("Student : "+ name);
    }

    static void report(String name,int marks) {

        System.out.println("Student : "+ name +" Marks : "+ marks);
    }

    static void report(String name,int marks,String grade) {

        System.out.println("Student : "+ name +" Marks : "
                + marks +" Grade : "+ grade);
    }

    static void report(String name,int marks,String grade,String course) {

        System.out.println("Student : "+ name +" Marks : "+ marks +
                " Grade : "+ grade +" Course : "+ course);
    }

    public static void main(String[] args) {

        report("Amit");

        report("Amit", 85);

        report("Amit", 85, "A");

        report("Amit", 85, "A", "BCA");
    }
}