import java.util.Scanner;

public class BEEC1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the two integer values
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Check if A is a multiple of B or vice versa
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
