package hw_2_2;

public class Main {

    /**
     * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int,
     * и просуммировать. Если в каком-то элементе массива преобразование не удалось
     * (например, в ячейке лежит символ или текст вместо числа),
     * должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
     * <p>
     * 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
     * и вывести результат расчета.
     */
    public static void main(String[] args) {


        String[][] strArr = {
                {"1", "2", "3", "4"},
                {"5", "f", "7"},
                {"8", "9"}
        };

        String[][] strArr2 = {
                {"1", "2", "3", "4"},
                {"5", "3", "7", "3"},
                {"8", "9", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] strArr3 = {
                {"1", "2", "3", "4"},
                {"5", "h", "7", "3"},
                {"8", "9", "3", "4"},
                {"1", "2", "3", "4"}
        };


        douArr(strArr);
        douArr(strArr2);
        douArr(strArr3);

    }

    public static void douArr(String[][] strArr) {
        try {

            for (int i = 0; i < strArr.length; i++) {
                if (strArr.length != 4 || strArr[i].length != 4) {
                    throw new MyArraySizeException(i, strArr);
                }
            }

            int sum = 0;
            for (int i = 0; i < strArr.length; i++) {
                for (int j = 0; j < strArr[i].length; j++) {
                    if (!isDigit(strArr[i][j])) {
                        throw new MyArrayDataException(strArr, i, j);
                    }
                    sum += Integer.parseInt(strArr[i][j]);


                }
            }

            System.out.println("sum: " + sum);

       } catch (MyArraySizeException e){
            e.print();
        } catch (MyArrayDataException e) {
            e.print();
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
