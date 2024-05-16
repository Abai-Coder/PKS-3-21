import java.util.Scanner;

public class BEEC1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading three integers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Sorting the integers
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = (a + b + c) - min - max;

        // Outputting in ascending order
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
        System.out.println();
        // Outputting in the sequence as they were read
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
