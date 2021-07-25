package hw_2_2;

import java.util.zip.DataFormatException;

public class MyArrayDataException extends NumberFormatException {
    private int line;
    private int collum;
    private String[][] arr;

    public MyArrayDataException(String[][] arr, int line, int collum) {
        this.line = line;
        this.collum = collum;
        this.arr = arr;

    }

    public void print() {
        System.out.println("date exception in line " + line + " collum " + collum);
    }

}
