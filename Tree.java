import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        System.out.print("Number of Rows:");
        Scanner num = new Scanner(System.in);
        double num;
        int nik = num;

        int rows = nik;
        int spaces = rows - 1;
        int stars = 1;

        // Reihe
        for (int row = 0; row < rows; row++) {
            // Leerzeichen
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }

            // Sterne
            for (int star = 0; star < stars; star++) {
                System.out.print("*");
            }

            // Werte updaten
            spaces = spaces - 1;
            stars = stars + 2;
            System.out.println();
        }
    }
}