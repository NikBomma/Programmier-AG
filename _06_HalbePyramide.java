import java.util.Scanner;

public class _06_HalbePyramide {
    public static <string> void main(String[] args) {
        System.out.println("Wie oft:");
        Scanner scanner = new Scanner(System.in);
        int anzahl = scanner.nextInt();
        anzahl = anzahl - 1;
        int i = 1;
        System.out.println(i);
        int z = 1;
        int j = 2;

        while (z <= anzahl) {
            String ii = Integer.toString(i);
            String jj = Integer.toString(j);
            ii = ii + jj;
            System.out.println(ii);
            i = Integer.parseInt(ii);
            z++;
            j++;
        }
    }
}