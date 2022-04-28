package Lecton01.homework02;

public class HomeWork02 {

    public static void main(String[] args) {
        boolean result = checkNumbers(10, 20);
        System.out.println(result);
        printPositiveOrNegative(876);
        boolean resultat = checkPositiveOrNegative(-67);
        System.out.println(resultat);
        printString("привет", 5);
        boolean isLeapYear = checkLeapYear(2104);
        System.out.println(isLeapYear);

    }

    public static boolean checkNumbers(int a, int b) {
        int x = a + b;
        if (x >= 10 & x <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void printPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }


    }

    public static boolean checkPositiveOrNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printString(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean checkLeapYear(int year) {
        int a = year % 400;
        if (a == 0) {
            return true;
        }
        a = year % 100;
        if (a == 0) {
            return false;
        }
        return (year % 4) == 0;
    }
}





