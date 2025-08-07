public class _08_ErsteMethoden {
    static class Flasche {
        int stand = 1000;

        void drink() {
            stand -= 50;
        }

        void getStand() {
            System.out.println(stand);
        }
    }

    public static void main(String[] args) {
        Flasche orange = new Flasche();
        Flasche rot = new Flasche();

        orange.drink();
        rot.getStand();
        orange.getStand();

        print1();
        print2();
        print3();
    }

    public static void print1() {
        System.out.println("Hello World!");
    }

    public static void print2() {
        System.out.println("Ich wurde direkt übergeben!");
    }

    public static void print3() {
        System.out.println("Bye World!");
    }
}