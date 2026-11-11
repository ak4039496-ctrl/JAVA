// Author: Amit Gupta
// Date: 09-09-2026
// Program: Join array elements into string

public class string_joinArray {
    public static void main(String[] args) {
        // Declare array
        String[] arr = {"Java", "is", "fun"};

        // Join using String.join()
        String result = String.join(" ", arr);

        //  Print result
        System.out.println("Joined => " + result);
    }
}
