import java.util.Scanner;

public class Calculatrice {

    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur: Division par zéro !");
            return Double.NaN; // Return NaN to indicate invalid result
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Création de l'objet Scanner pour l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();

        int choix;
        do {
            System.out.println("Choisissez une opération:");
            System.out.println("1 Addition");
            System.out.println("2 Soustraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 Quitter");

            choix = scanner.nextInt();

            if (choix == 5) {
                break;
            }

            System.out.print("Entrez le premier nombre: ");
            double num1 = scanner.nextDouble();

            System.out.print("Entrez le deuxième nombre: ");
            double num2 = scanner.nextDouble();

            double resultat = 0;

            switch (choix) {
                case 1:
                    resultat = calc.addition(num1, num2);
                    break;
                case 2:
                    resultat = calc.soustraction(num1, num2);
                    break;
                case 3:
                    resultat = calc.multiplication(num1, num2);
                    break;
                case 4:
                    resultat = calc.division(num1, num2);
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
                    continue;
            }

            // Only print the result if it's a valid number
            if (!Double.isNaN(resultat)) {
                System.out.println("Résultat: " + resultat);
            }

        } while (choix != 5);
    }
}
