import java.util.Scanner;

public class _13_Anmeldung {
    public static void main(String[] args) {

        System.out.print("Gebe dein Benutzername ein: ");
        Scanner name2 = new Scanner(System.in);
        String name = name2.nextLine();
        int v = 3;
        if (name.equals("Nikgames")) {
            System.out.println("");
            System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("3 Versuche noch");
            System.out.print("Gebe dein Passwort ein: ");
            Scanner wort1 = new Scanner(System.in);
            String wort2 = wort1.nextLine();

            if (wort2.equals("Passwort123")) {
                System.out.println("");
                System.out.println("Eingeloggt");
            } else {
                System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________");
                System.out.println( "2 Versuche noch");
                System.out.print("Gebe dein Passwort ein: ");
                Scanner wort3 = new Scanner(System.in);
                String wort4 = wort3.nextLine();
                if (wort4.equals("Passwort123")) {
                    System.out.println("");
                    System.out.println("!Eingeloggt");
                } else {
                    System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________");
                    System.out.println( "1 Versuch noch");
                    System.out.print("Gebe dein Passwort ein: ");
                    Scanner wort5 = new Scanner(System.in);
                    String wort6 = wort5.nextLine();
                    if ( wort6.equals("Passwort123")){
                        System.out.println("");
                        System.out.println("Eingeloggt");
                    } else {
                        System.out.println("!ERROR: Anmeldung fehlgeschlagen!");
                        System.exit(1516060518);
                    }
                }
            }
        } else {
            System.out.println("Wenn du schon den Benutzernamen Falsch hast, dann schaffst du das Passwort auf gar keinen Fall");
            System.exit(1516060518);
        }
    }
}