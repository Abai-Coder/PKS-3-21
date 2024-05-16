import java.util.Scanner;

public class BEEC1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the four grades
        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        // Calculating the weighted average
        double average = (N1 * 2 + N2 * 3 + N3 * 4 + N4) / 10;

        // Printing the average
        System.out.printf("Media: %.1f\n", average);

        // Checking if the student is in exam
        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            // Reading the exam score
            double examScore = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", examScore);
            // Calculating the final average
            double finalAverage = (average + examScore) / 2;
            if (finalAverage >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            // Printing the final average
            System.out.printf("Media final: %.1f\n", finalAverage);
        }
    }
}
