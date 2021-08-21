package hw_2_5;

public class Test implements Runnable {

    private float[] arr;
    private int index;

    public Test(float[] arr, int index) {
        this.arr = arr;
        this.index = index;
    }

    @Override
    public void run() {
        formula(arr, index);
    }

    public static void formula (float[] arr, int index) {
        for (int i = 0; i < arr.length  ; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + index) / 5.0) * Math.cos(0.2f + (i + index) / 5.0) * Math.cos(0.4f + (i + index) / 2.0));
        }

    }
}
