package Lecton01.Homework03;

public class HomeWork03 {
    public static void main(String[] args) {
        replaceNumbers();
        fillArray();
        toIncreaseArray();
    }

    public static void replaceNumbers() {
        int[] intArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        //                0  1  2  3  4  5  6  7  8  9
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 1) {
                intArray[i] = 0;
            } else {
                intArray[i] = 1;
            }
        }
    }

    public static void fillArray() {
        int[] myArray = new int[100];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
    }

    public static void toIncreaseArray() {
        int[] intArray2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println();
        for (int i = 0; i < intArray2.length; i++) {
            if (intArray2[i] < 6) {
                intArray2[i] = intArray2[i] * 2;
            }
        }
    }

    public static void twoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) == array.length) {
                    array[i][j] = 1;
                }
            }
        }

    }


    public static int[] createArray(int len, int initialValue) {
        int[] myArrayInt = new int[len];
        for (int i = 0; i < myArrayInt.length; i++) {
            myArrayInt[i] = initialValue;
        }
        return myArrayInt;
    }
}
