package Lecton01.homework01;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Apple");
        System.out.println("Orange");
        System.out.println("Banana");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = 2;
        int x = a + b;
        if (x >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("красный");
        }
        if (value > 0 & value <= 100) {
            System.out.println("желтый");
        }
        if (value > 100) {
            System.out.println("зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}




