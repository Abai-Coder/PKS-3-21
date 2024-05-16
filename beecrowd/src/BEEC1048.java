import java.util.Scanner;

public class BEEC1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read employee's salary
        double salary = sc.nextDouble();

        // Define the salary ranges and corresponding adjustment rates
        double[] salaryRanges = {0, 400.00, 800.00, 1200.00, 2000.00};
        double[] adjustmentRates = {0.15, 0.12, 0.10, 0.07, 0.04};

        // Find the appropriate adjustment rate based on the salary
        double adjustmentRate = 0.0;
        for (int i = salaryRanges.length - 1; i >= 0; i--) {
            if (salary > salaryRanges[i]) {
                adjustmentRate = adjustmentRates[i];
                break;
            }
        }

        // Calculate the new salary, money earned, and percentual increase
        double newSalary = salary * (1 + adjustmentRate);
        double moneyEarned = newSalary - salary;
        int percentage = (int) (adjustmentRate * 100);

        // Print the results
        System.out.printf("Novo salario: %.2f%n", newSalary);
        System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
        System.out.println("Em percentual: " + percentage + " %");
    }
}
