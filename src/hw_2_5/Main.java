package hw_2_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static void main(String[] args) {

        long a = System.currentTimeMillis();

        for (int i = 0; i < args.length; i++) {
            arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);


        long b = System.currentTimeMillis();

        float[] arr2 = new float[h];
        System.arraycopy(arr, 0, arr2, 0, h);
        float[] arr3 = new float[h];
        System.arraycopy(arr, h, arr3, 0, h);

        Thread thread1 = new Thread(new Test(arr2));
        Thread thread2 = new Thread(new Test(arr3));

        thread1.start();
        thread2.start();

        System.arraycopy(arr2, 0, arr, 0, h);
        System.arraycopy(arr3, 0, arr, h, h);


        System.out.println(System.currentTimeMillis() - b);
    }

   /* public static void formula (float[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

    }*/
}
