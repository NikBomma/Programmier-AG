import java.util.Scanner;

public class _05_Durchschnitt {
    public static void main(String[] args) {
        System.out.println("Gib drei ganze Zahlen ein");

        System.out.print("Zahl 1:");
        Scanner scanner = new Scanner(System.in);
        int zahl1 = scanner.nextInt();

        System.out.print("Zahl 2:");
        Scanner scanner2 = new Scanner(System.in);
        int zahl2 = scanner2.nextInt();


        System.out.print("Zahl 3:");
        Scanner scanner3 = new Scanner(System.in);
        int zahl3 = scanner3.nextInt();

        int zahl9 = zahl1 + zahl2 + zahl3;
        double zahl = zahl9;
        double durchschnitt = zahl / 3;
        System.out.println(durchschnitt);
    }
}