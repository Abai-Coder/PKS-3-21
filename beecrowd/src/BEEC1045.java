import java.util.Arrays;
import java.util.Scanner;

public class BEEC1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the sides of the triangle
        double[] sides = new double[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = sc.nextDouble();
        }

        // Sort the sides in decreasing order
        Arrays.sort(sides);
        double A = sides[2];
        double B = sides[1];
        double C = sides[0];

        // Check the type of triangle
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((A == B && A != C) || (B == C && B != A) || (C == A && C != B)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
