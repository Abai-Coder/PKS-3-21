import java.util.Scanner;

public class BEEC1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the DDD
        int ddd = sc.nextInt();

        // Define the city according to the DDD
        String city;
        switch (ddd) {
            case 61:
                city = "Brasilia";
                break;
            case 71:
                city = "Salvador";
                break;
            case 11:
                city = "Sao Paulo";
                break;
            case 21:
                city = "Rio de Janeiro";
                break;
            case 32:
                city = "Juiz de Fora";
                break;
            case 19:
                city = "Campinas";
                break;
            case 27:
                city = "Vitoria";
                break;
            case 31:
                city = "Belo Horizonte";
                break;
            default:
                city = "DDD nao cadastrado";
        }

        // Print the result
        System.out.println(city);
    }
}
