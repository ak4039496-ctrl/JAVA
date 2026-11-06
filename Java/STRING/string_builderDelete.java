// Author: Amit Gupta
// Date: 09-09-2026
// Program: Delete characters using StringBuilder

public class string_builderDelete {
    public static void main(String[] args) {
        //  Create StringBuilder
        StringBuilder sb = new StringBuilder("Hello World");

        //  Delete characters from index 5 to 11
        sb.delete(5, 11);

        //  Print result
        System.out.println("Deleted => " + sb.toString());
    }
}
