import java.util.Scanner;

public class Machine {
    public static void main(String[] args) {
        System.out.println("Bitte Geld einwerfen");
        Scanner Guthaben1 = new Scanner(System.in);
        double Guthaben = Guthaben1.nextDouble();
        System.out.println("Ihr Guthaben:   " + Guthaben + "€");

        System.out.println("Produkte in der Maschine:");
        System.out.println("    1 - Sprite         1,50€    |   11 - Haribo         1,50€");
        System.out.println("    2 - Fanta          1,50€    |   12 - Milka          2,00€");
        System.out.println("    3 - Spezi          2,00€    |   13 - Chips          2,50€");
        System.out.println("    4 - Coca Cola      2,50€    |   14 - Riegel         1,00€");
        System.out.println("    5 - Eistee         1,50€    |   15 - kinder bueno   1,00€");

        System.out.println("Wie viele Produkte wollen sie kaufen?");
        Scanner anzahl1 = new Scanner(System.in);
        int anzahl = anzahl1.nextInt();

        for (int z = 1; z <= anzahl; z++) {

            System.out.println("Welches Produkt wollen Sie haben? Geben Sie die Zahl davor ein (z.B.: 1)");
            Scanner Wunsch1 = new Scanner(System.in);
            String Wunsch = Wunsch1.next();
            if ("1".equals(Wunsch)) { // Sprite
                System.out.println("Möchten Sie eine Sprite kaufen? Drücken Sie J, wenn ja und N, wenn sie es nicht kaufen wollen");
                Scanner Sprite1 = new Scanner(System.in);
                String Sprite = Sprite1.next();
                double a = 1.50;

                if ("J".equals(Sprite)) {
                    if (Guthaben - a < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Sprite");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - a) + "€. Bitte Geld entnehmen");
                    }
                } else if ("j".equals(Sprite)) {
                    if (Guthaben - a < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Sprite");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - a) + "€. Bitte Geld entnehmen");
                    }
                } else {
                    System.out.println("Einkauf wurde abgebrochen. Bitte Geld entnehmen");
                }
            } else if ("2".equals(Wunsch)) { //Fanta
                System.out.println("Möchten Sie die Fanta kaufen? Drücken sie J, wenn ja und N, wenn Sie es nicht kaufen wollen");
                Scanner Fanta1 = new Scanner(System.in);
                String Fanta = Fanta1.next();
                double b = 1.50;

                if ("J".equals(Fanta)) {
                    if (Guthaben - b < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Fanta");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - b) + "€. Bitte Geld entnehmen");
                    }
                } else if ("j".equals(Fanta)) {
                    if (Guthaben - b < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Fanta");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - b) + "€. Bitte Geld entnehmen");
                    }
                } else {
                    System.out.println("Einkauf wurde abgebrochen. Bitte Geld entnehmen");
                }
            } else if ("3".equals(Wunsch)) { //Spezi
                System.out.println("Möchten Sie die Spezi kaufen? Drücken sie J, wenn ja und N, wenn Sie es nicht kaufen wollen");
                Scanner Spezi1 = new Scanner(System.in);
                String Spezi = Spezi1.next();
                double c = 2.00;

                if ("J".equals(Spezi)) {
                    if (Guthaben - c < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Spezi");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - c) + "€. Bitte Geld entnehmen");
                    }
                } else if ("j".equals(Spezi)) {
                    if (Guthaben - c < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Spezi");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - c) + "€. Bitte Geld entnehmen");
                    }
                } else {
                    System.out.println("Einkauf wurde abgebrochen. Bitte Geld entnehmen");
                }
            } else if ("4".equals(Wunsch)) { //Coca Cola
                System.out.println("Möchten Sie die Coca Cola kaufen? Drücken sie J, wenn ja und N, wenn Sie es nicht kaufen wollen");
                Scanner Cola1 = new Scanner(System.in);
                String Cola = Cola1.next();
                double d = 2.50;

                if ("J".equals(Cola)) {
                    if (Guthaben - d < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Coca Cola");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - d) + "€. Bitte Geld entnehmen");
                    }
                } else if ("j".equals(Cola)) {
                    if (Guthaben - d < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Coca Cola");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - d) + "€. Bitte Geld entnehmen");
                    }
                } else {
                    System.out.println("Einkauf wurde abgebrochen. Bitte Geld entnehmen");
                }
            } else if ("5".equals(Wunsch)) { // Eistee
                System.out.println("Möchten Sie den Eistee kaufen? Drücken sie J, wenn ja und N, wenn Sie es nicht kaufen wollen ");
                Scanner Eistee1 = new Scanner(System.in);
                String Eistee = Eistee1.next();
                double e = 1.50;

                if ("J".equals(Eistee)) {
                    if (Guthaben - e < 0) {
                        System.out.println("3Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Eistee");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - e) + "€. Bitte Geld entnehmen");
                    }
                } else if ("j".equals(Eistee)) {
                    if (Guthaben - e < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Eistee");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - e) + "€. Bitte Geld entehmen");
                    }
                } else {
                    System.out.println("Einkauf abgebrochen. Bitte Geld entnehmen");
                }
            } else if ("11".equals(Wunsch)) { // Haribo
                System.out.println("Möchten Sie Haribo kaufen? Drücken sie J, wenn ja und N, wenn Sie es nicht kaufen wollen ");
                Scanner Haribo1 = new Scanner(System.in);
                String Haribo = Haribo1.next();
                double f = 1.50;

                if ("J".equals(Haribo)) {
                    if (Guthaben - f < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihr Haribo");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - f) + "€. Bitte Geld entnehmen");
                    }
                } else if ("j".equals(Haribo)) {
                    if (Guthaben - f < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihr Haribo");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - f) + "€. Bitte entehmen");
                    }
                } else {
                    System.out.println("Einkauf abgebrochen. Bitte Geld entnehmen");
                }
            } else if ("12".equals(Wunsch)) { //Milka
                System.out.println("Möchten Sie die Milka kaufen? Drücken sie J, wenn ja und N, wenn Sie es nicht kaufen wollen ");
                Scanner Milka1 = new Scanner(System.in);
                String Milka = Milka1.next();
                double g = 2.00;

                if ("J".equals(Milka)) {
                    if (Guthaben - g < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Milka");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - g) + "€. Bitte Geld entnehmen");
                    }
                } else if ("j".equals(Milka)) {
                    if (Guthaben - g < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Milka");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - g) + "€. Bitte entehmen");
                    }
                } else {
                    System.out.println("Einkauf abgebrochen. Bitte Geld entnehmen");
                }
            } else if ("13".equals(Wunsch)) { // Chips
                System.out.println("Möchten Sie Chips kaufen? Drücken sie J, wenn ja und N, wenn Sie es nicht kaufen wollen ");
                Scanner Chips1 = new Scanner(System.in);
                String Chips = Chips1.next();
                double h = 2.50;

                if ("J".equals(Chips)) {
                    if (Guthaben - h < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Chips");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - h) + "€. Bitte Geld entnehmen");
                    }
                } else if ("j".equals(Chips)) {
                    if (Guthaben - h < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Chips");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - h) + "€. Bitte entehmen");
                    }
                } else {
                    System.out.println("Einkauf abgebrochen. Bitte Geld entnehmen");
                }
            } else if ("14".equals(Wunsch)) { // Riegel
                System.out.println("Möchten Sie den Riegel kaufen? Drücken sie J, wenn ja und N, wenn Sie es nicht kaufen wollen ");
                Scanner Riegel1 = new Scanner(System.in);
                String Riegel = Riegel1.next();
                double i = 1.00;

                if ("J".equals(Riegel)) {
                    if (Guthaben - i < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Riegel");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - i) + "€. Bitte Geld entnehmen");
                    }
                } else if ("j".equals(Riegel)) {
                    if (Guthaben - i < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihre Riegel");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - i) + "€. Bitte entehmen");
                    }
                } else {
                    System.out.println("Einkauf abgebrochen. Bitte Geld entnehmen");
                }
            } else if ("15".equals(Wunsch)) { // kinder bueno
                System.out.println("Möchten Sie den kinder bueno kaufen? Drücken sie J, wenn ja und N, wenn Sie es nicht kaufen wollen ");
                Scanner bueno1 = new Scanner(System.in);
                String bueno = bueno1.next();
                double j = 1.00;

                if ("J".equals(bueno)) {
                    if (Guthaben - j < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihren kinder bueno");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - j) + "€. Bitte Geld entnehmen");
                    }
                } else if ("j".equals(bueno)) {
                    if (Guthaben - j < 0) {
                        System.out.println("Einkauf abgebrochen, weil Sie haben zu wenig Guthaben. Bitte Geld entnehmen");
                    } else {
                        System.out.println("Bitte entnehmen sie ihren kinder bueno");
                        System.out.println("Ihr Rückgeld: " + (Guthaben = Guthaben - j) + "€. Bitte entehmen");
                    }
                } else {
                    System.out.println("Einkauf abgebrochen. Bitte Geld entnehmen");
                }
            } else {
                System.out.println("Kein Produkt kann zu der Nummer zugeordnet werden. Einkauf wird abgebrochen. Bitte Geld entnehmen");
            }
        }
    }
}