package hw_2_2;

public class MyArraySizeException extends Throwable {

    int i;
    String[][] arr;

    public MyArraySizeException(int i, String[][] arr) {
        this.i = i;
        this.arr = arr;
    }

    public void print() {
        if (arr.length != 5 || arr[i].length != 5) {
            System.out.println("не верный размер");
        }

    }
}
