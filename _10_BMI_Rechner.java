import java.util.Scanner;

public class _10_BMI_Rechner {
    public static void main(String[] args) {
        System.out.print("Bitte gib dein Körpergewicht in kg an: ");
        Scanner kg1 = new Scanner(System.in);
        double kg = kg1.nextDouble();

        System.out.print("Bitte gib deine Körpergröße in metern an: ");
        Scanner m1 = new Scanner(System.in);
        double m = m1.nextDouble();

        double bmi1 = kg / (m*m);
        double bmi = Math.round(bmi1 * 100.0) / 100.0;
        System.out.println("Dein BMI beträgt: " + bmi);

        if (bmi < 16) {
            System.out.println("Klassifikation: Kritisches Untergewicht");
        } else if (bmi >= 16 && bmi <= 18.5) {
            System.out.println("Klassifikation: Untergewicht");
        } else if (bmi > 18.5 && bmi <= 25) {
            System.out.println("Klassifikation: Normalgewicht");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("Klassifikation: Leichtes Übergewicht");
        } else if (bmi > 30) {
            System.out.println("Klassifikation: Übergewicht");
        } else {
            System.out.println("Irgendetwas stimmt nicht");
        }
    }
}
