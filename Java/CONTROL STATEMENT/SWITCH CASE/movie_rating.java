// Author: Amit Gupta
// Date: 08-09-2026
// Program: Movie rating

public class movie_rating {
    public static void main(String[] args) {
        
        int stars = 4;
        
        switch(stars) {
            case 1: System.out.println("Poor"); break;
            case 2: System.out.println("Average"); break;
            case 3: System.out.println("Good"); break;
            case 4: System.out.println("Very Good"); break;
            case 5: System.out.println("Excellent"); break;
            default: System.out.println("Invalid rating!");
        }
    }
}
