package dz1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 2;
        int c = a + b;

        if (c >= 0) {
            System.out.println("сумма положениительная");
        } else {
            System.out.println("сумма отрицицательная");
        }
    }

    public static void printColor() {
        int value = 3;

        if (value <= 0) {
            System.out.println("красный");
        } else if (value > 0 && value < 101) {
            System.out.println("желтый");
        } else {
            System.out.println("заленый");
        }
    }

    public static void compareNumbers() {
        int a = 0;
        int b = 5;

        if (a >= b){
            System.out.println("a >=b");
        }else {
            System.out.println("a < b");
        }
    }
}
