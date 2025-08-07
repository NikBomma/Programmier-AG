import java.util.Random;
import java.util.Scanner;

public class _09_Wuerfelspiel {
    public static void main(String[] args) {
        System.out.print("Wie viele Würfe denkst du, braucht es bis zu einer 6: ");
        Scanner scanner = new Scanner(System.in);
        int anzahl = scanner.nextInt();
        Random random = new Random();
        int zahl = random.nextInt(6) + 1;
        int versuch = 0;

        while (zahl != 6) {
            zahl = random.nextInt(6) + 1;
            System.out.println("Es wurde eine " + zahl + " gewürfelt");
            versuch++;
        }
        System.out.println("Benötigte Versuche: " + versuch);
    }
}
