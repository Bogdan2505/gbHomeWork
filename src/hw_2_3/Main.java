package hw_2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Main {

    /**
     * 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
     * В этот телефонный справочник с помощью метода add() можно добавлять записи.
     * С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов,
     * тогда при запросе такой фамилии должны выводиться все телефоны.
     * <p>
     * Желательно как можно меньше добавлять своего,
     * чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес),
     * делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner),
     * тестировать просто из метода main() прописывая add() и get().
     */

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("tom", "ron", "cat", " dog ", "animal", "pig", "cat", "cat", "cat", " dog ", " dog ", " dog ", " dog "));
        ArrayList<String> arrUnique = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arrUnique.indexOf(arr.get(i)) == -1) {
                arrUnique.add(arr.get(i));
            }
        }
        System.out.println(arrUnique);

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            map.put(arr.get(i), map.getOrDefault(arr.get(i),  0) + 1);
        }

        System.out.println(map);



        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add( "Fara", 890055944);
        phoneBook.add( "Fara2", 899955944);
        phoneBook.add( "Fara3", 898855944);
        phoneBook.add( "Fara", 897755944);


        System.out.println(phoneBook.get("Fara2"));

    }
}
