// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print planet name

public class planet_name {
    public static void main(String[] args) {
        
        int planet = 4;
        
        switch(planet) {
            case 1: System.out.println("Mercury"); break;
            case 2: System.out.println("Venus"); break;
            case 3: System.out.println("Earth"); break;
            case 4: System.out.println("Mars"); break;
            case 5: System.out.println("Jupiter"); break;
            case 6: System.out.println("Saturn"); break;
            case 7: System.out.println("Uranus"); break;
            case 8: System.out.println("Neptune"); break;
            default: System.out.println("Invalid planet!");
        }
    }
}
