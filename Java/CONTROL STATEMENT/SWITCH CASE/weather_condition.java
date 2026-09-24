// Author: Amit Gupta
// Date: 20-09-2026
// Program: Weather condition

public class weather_condition {
    public static void main(String[] args) {
        
        int choice = 2;
        
        switch(choice) {
            case 1: System.out.println("Sunny"); break;
            case 2: System.out.println("Rainy"); break;
            case 3: System.out.println("Cloudy"); break;
            case 4: System.out.println("Snowy"); break;
            default: System.out.println("Unknown weather!");
        }
    }
}
