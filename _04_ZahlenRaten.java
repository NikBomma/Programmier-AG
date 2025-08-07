import java.util.Random;
import java.util.Scanner;

public class _04_ZahlenRaten {
    public static void main(String[] args) {
        System.out.println("Ich denke mir eine Zahl zwischen 1 und 100 aus.");
        System.out.println("Wer von euch näher dran ist, gewinnt.");
        Random random = new Random();
        int zahl = random.nextInt(100) + 1;

        System.out.print("Spieler 1, bitte gib deine Zahl ein: ");
        Scanner scanner = new Scanner(System.in);
        int spieler1 = scanner.nextInt();

        System.out.print("Spieler 2, bitte gib deine Zahl ein: ");
        Scanner scanner1 = new Scanner(System.in);
        int spieler2 = scanner1.nextInt();

        int spieler11 = zahl - spieler1;
        int spieler22 = zahl - spieler2;

        if (spieler11 < 0) {
            spieler11 = spieler11 * (-1);
        } else {
            spieler11 = spieler11 * 1;
        }
        if (spieler22 < 0) {
            spieler22 = spieler22 * (-1);
        } else {
            spieler22 = spieler22 * 1;
        }
        System.out.println("Vielen Dank! Ich vergleiche nun eure Zahlen mit meiner Zahl.");
        if (spieler11 == spieler22) {
            System.out.println("Da meine Zahl " + zahl + " war, ist es ein Unentschieden");
        } else if (spieler11 < spieler22) {
            System.out.println("Da meine Zahl " + zahl + " war, hat Spieler 1 gewonnen.");
        } else if (spieler11 > spieler22) {
            System.out.println("Da meine Zahl " + zahl + " war, hat Spieler 2 gewonnen.");
        }
        System.out.println("Herzlichen Glückwunsch!");
    }
}