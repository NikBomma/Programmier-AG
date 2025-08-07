import java.util.Scanner;

public class _01_Alterspruefung {
    public static void main(String[] args) {
        System.out.println("Wie alt bist du?");
        Scanner alter1 = new Scanner(System.in);
        int alter = alter1.nextInt();
        int i = 18;

        if(alter < i) {
            System.out.println("Du bist noch minderjärig");
        } else if(alter == i) {
            System.out.println("Du bist gerade volljährig geworden");
        } else if(alter > i) {
            System.out.println("Du bist volljährig");
        }
    }
}
