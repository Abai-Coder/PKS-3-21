import java.util.Scanner;

public class BEEC1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read three words
        String word1 = sc.nextLine().toLowerCase();
        String word2 = sc.nextLine().toLowerCase();
        String word3 = sc.nextLine().toLowerCase();

        // Define the animal according to the table
        String animal = "";
        if (word1.equals("vertebrado")) {
            if (word2.equals("ave")) {
                if (word3.equals("carnivoro")) {
                    animal = "aguia";
                } else if (word3.equals("onivoro")) {
                    animal = "pomba";
                }
            } else if (word2.equals("mamifero")) {
                if (word3.equals("onivoro")) {
                    animal = "homem";
                } else if (word3.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        } else if (word1.equals("invertebrado")) {
            if (word2.equals("inseto")) {
                if (word3.equals("hematofago")) {
                    animal = "pulga";
                } else if (word3.equals("herbivoro")) {
                    animal = "lagarta";
                }
            } else if (word2.equals("anelideo")) {
                if (word3.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (word3.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }

        // Print the chosen animal
        System.out.println(animal);
    }
}
