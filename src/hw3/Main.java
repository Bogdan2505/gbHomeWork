package hw3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        masOneNull();
        masLength100();
        masPositive6();
        matrix();
        int[] mas = masReturnMasInitialValue(5, 7);
        System.out.println(Arrays.toString(mas));
        maxMin();

        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(bathPathEquals(arr));

        foo(new int[]{1, 2, 3, 4, 5, 6, 7}, -2);
    }

    /**
     * целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void masOneNull() {
        int[] mas = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                mas[i] = 1;
            } else {
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }

    /**
     * Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void masLength100() {

        int[] mas = new int[100];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
        }
        System.out.println(Arrays.toString(mas));
    }

    /**
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void masPositive6() {

        int[] mas = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) {
                mas[i] = mas[i] * 2;
            }
        }
        System.out.println(Arrays.toString(mas));
    }

    /**
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
     * то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void matrix() {

        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || matrix.length - 1 == i + j) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static int[] masReturnMasInitialValue(int len, int initialValue) {

        int[] mas = new int[len];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = initialValue;
        }
        return mas;
    }

    /**
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */
    public static void maxMin() {

        int[] mas = new int[]{1, 4, 3, 8, 6, 9, 3, 9, 2, 5};

        Arrays.sort(mas);

        System.out.println("max: " + mas[mas.length - 1] + " min: " + mas[0]);
    }

    /**
     * Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     * <p>
     * *Примеры:
     * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
     * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     * checkBalance([1, 14, 1, ||| 2, 1, 6, 7]) → true, т.е. 1 + 14 + 1 = 2 + 1 + 6 + 7
     */
    public static boolean bathPathEquals(int[] inputMas) {

        int right = 0;
        int left = 0;
        int count = 0;

        int i = 0;
        while (i < inputMas.length - count) {
            if (left <= right) {
                left += inputMas[i];
                i++;
            } else {
                right += inputMas[inputMas.length - 1 - count];
                count++;
            }
        }

        return left == right;
    }

    /**
     * ** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
     * или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
     * Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
     * При каком n в какую сторону сдвиг можете выбирать сами.
     */

    /*public static void move(int[] mas , int n ) {

        if ( n != mas.length){
            n = n % mas.length;
        }else {
            System.out.println(Arrays.toString(mas));
        }


        if ( n < 0 ) {
            n = Math.abs(n);
            for (int i = 0; i < mas.length - n; i++) {

                int t = mas[i + n];
                mas[i + n] = mas[i];
                mas[i] = t;

            }
        }else {
            int t = 0;
            for (int i = 0; i < mas.length - n; i++) {

                if (i == mas.length - n - 1) {
                    t = mas[mas.length - 1];
                    mas[mas.length - 1] = mas[0];
                    mas[0] = t;
                } else {
                    t = mas[i];
                    mas[i] = mas[i + n];
                    mas[i + n] = t;

                }
            }
        }

        System.out.println(Arrays.toString(mas));
    }
*/
    public static void foo(int[] arr, int n) {
        int temp;
        int len = arr.length - 1;
        if (n < 0) {
            for (int i = 0; i < -n; i++) {
                temp = arr[0];
                System.arraycopy(arr, 1, arr, 0, len);
                arr[len] = temp;
            }
        } else {
            for (int i = 0; i < n; i++) {
                temp = arr[len];
                System.arraycopy(arr, 0, arr, 1, len);
                arr[0] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
