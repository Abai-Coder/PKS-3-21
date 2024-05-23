import java.util.Scanner;
import java.text.DecimalFormat;

public class LAB1EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вес на Земле в кг: ");
        double earthWeight = scanner.nextDouble();

        double moonWeightFactor = 0.165;
        double annualWeightIncrease = 0.032;
        int years = 15;

        DecimalFormat df = new DecimalFormat("0.###");

        System.out.println("Результаты:");
        for (int year = 1; year <= years; year++) {
            double moonWeight = earthWeight * moonWeightFactor;
            System.out.println(year + " год: " + df.format(moonWeight) + " кг");
            earthWeight += earthWeight * annualWeightIncrease;
        }
    }
}
