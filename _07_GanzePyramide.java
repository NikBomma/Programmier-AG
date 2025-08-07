import java.util.Scanner;

public class _07_GanzePyramide {
    public static void main(String[] args) {
        System.out.println("Wie oft:");
        Scanner scanner1 = new Scanner(System.in);
        int anzahl = scanner1.nextInt();
        int i = 2;
        int a = anzahl - 1;
        String p = "1";
        System.out.print(" ".repeat(a));
        System.out.println(p);
        a = anzahl - 2;

        for (int z = 0; z < anzahl - 1; z++) {
            System.out.print(" ".repeat(a));
            String ii = Integer.toString(i);
            String jj = ii + p + ii;
            p = jj;
            System.out.println(p);
            i++;
            a--;
        }
    }
}