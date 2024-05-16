import java.util.Scanner;

public class BEEC1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the coordinates
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        // Checking if the point is at the origin
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        // Checking if the point is on the X axis
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        // Checking if the point is on the Y axis
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        // Determining the quadrant
        else {
            if (x > 0.0 && y > 0.0) {
                System.out.println("Q1");
            } else if (x < 0.0 && y > 0.0) {
                System.out.println("Q2");
            } else if (x < 0.0 && y < 0.0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q4");
            }
        }
    }
}
