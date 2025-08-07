import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double number1, number2, result = 0.0;
        char operator;
        boolean loop = true;

        while (loop) {
            System.out.print("Please enter number 1: ");
            number1 = Double.parseDouble(sc.nextLine());

            System.out.print("Please  enter a operator (+-*/%): ");
            operator = sc.nextLine().charAt(0);

            System.out.print("Please enter number 2: ");
            number2 = Double.parseDouble(sc.nextLine());


            switch (operator) {
                case '+' -> {result = number1 + number2;}
                case '-' -> {result = number1 - number2;}
                case '*' -> {result = number1 * number2;}
                case '/' -> {
                    if (number2 == 0) {
                        System.out.println("[Fail] It isn't possible");
                        System.exit(1);
                    }
                }
            }
        }
    }
}
