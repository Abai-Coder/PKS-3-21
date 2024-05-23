import java.util.Scanner;

public class LAB2EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // consume the invalid input
            System.out.println("Try again. (Incorrect input: an integer is required)");
            System.out.print("Enter an integer: ");
        }

        int number = scanner.nextInt();
        System.out.println("The number entered is " + number);

        scanner.close();
    }
}
