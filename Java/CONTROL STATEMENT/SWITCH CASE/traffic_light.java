// Author: Amit Gupta
// Date: 20-09-2026
// Program: Traffic light message

public class traffic_light {
    public static void main(String[] args) {
        
        char light = 'R'; 
        
        switch(light) {
            case 'R': System.out.println("STOP"); break;
            case 'G': System.out.println("GO"); break;
            case 'Y': System.out.println("WAIT"); break;
            default: System.out.println("Invalid light color!");
        }
    }
}
