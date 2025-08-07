import java.util.Scanner;

public class _02_Jahreszeit {
    public static void main(String[] args) {
        System.out.println("Welcher Monat");
        Scanner monat1 = new Scanner(System.in);
        int monat = monat1.nextInt();

        if (monat == 1 || monat == 2 || monat == 12) {
            System.out.println("Es ist Winter");
        } else if (monat == 3 || monat == 4 || monat == 5) {
            System.out.println("Es ist Frühling");
        } else if (monat == 6 || monat == 7 || monat == 8) {
            System.out.println("Es ist Sommer");
        } else if (monat == 9 || monat == 10 || monat == 11) {
            System.out.println("Es ist Herbst");
        } else {
            System.out.println("Dies ist keine Jahreszeit");
        }
    }
}