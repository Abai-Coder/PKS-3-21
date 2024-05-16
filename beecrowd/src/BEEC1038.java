import java.util.Scanner;

public class BEEC1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading product code and quantity
        int code = sc.nextInt();
        int quantity = sc.nextInt();

        // Initializing price variable
        double price = 0;

        // Checking product code and assigning price
        switch (code) {
            case 1:
                price = 4.00;
                break;
            case 2:
                price = 4.50;
                break;
            case 3:
                price = 5.00;
                break;
            case 4:
                price = 2.00;
                break;
            case 5:
                price = 1.50;
                break;
        }

        // Calculating total price
        double total = price * quantity;

        // Printing total price
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
