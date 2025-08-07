import java.util.Scanner;

public class _11_Durchschnitt_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib eine Reihe von Zahlen ein (durch Kommas und Leerzeichen getrennt): ");
        String eingabe = scanner.nextLine();
        String[] teile = eingabe.split(",\\s*");

        int summe = 0;
        int anzahl = teile.length;

        for (String teil : teile) {
            summe += Integer.parseInt(teil);
        }

        double durchschnitt = (double) summe / anzahl;
        System.out.printf("Der Durchschnitt ist: %.1f", durchschnitt);
    }
}