package hw_2_5;

import java.util.Arrays;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arrRun = new float[size];
    static float[] arr = new float[size];


    public static void main(String[] args) {


        for (int i = 0; i < args.length; i++) {
            arrRun[i] = 1;
            arr[i] = 1;
        }




        float[] arr2 = new float[h];
        System.arraycopy(arrRun, 0, arr2, 0, h);
        float[] arr3 = new float[h];
        System.arraycopy(arrRun, h, arr3, 0, h);

        Thread thread1 = new Thread(new Test(arr2, 0));
        Thread thread2 = new Thread(new Test(arr3, h));

        long b = System.currentTimeMillis();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr2, 0, arrRun, 0, h);
        System.arraycopy(arr3, 0, arrRun, h, h);


        System.out.println(System.currentTimeMillis() - b);

        long a = System.currentTimeMillis();
        formula(arr);
        System.out.println(System.currentTimeMillis() - a);

        System.out.println(Arrays.equals(arrRun, arr));

    }

    public static void formula(float[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0));
        }
    }
}
