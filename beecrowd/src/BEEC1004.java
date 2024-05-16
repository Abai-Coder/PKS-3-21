import java.util.Scanner;

public class BEEC1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение двух целых чисел
        int A = sc.nextInt();
        int B = sc.nextInt();

        int PROD = A * B;

        System.out.println("PROD = " + PROD);
    }
}