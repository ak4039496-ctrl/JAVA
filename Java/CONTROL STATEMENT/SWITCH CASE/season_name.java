// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print season name 

public class season_name {
    public static void main(String[] args) {
        
        int month = 4; // Example: April
        
        switch(month) {
            case 12: case 1: case 2: System.out.println("Winter"); break;
            case 3: case 4: case 5: System.out.println("Spring"); break;
            case 6: case 7: case 8: System.out.println("Summer"); break;
            case 9: case 10: case 11: System.out.println("Autumn"); break;
            default: System.out.println("Invalid month!");
        }
    }
}
