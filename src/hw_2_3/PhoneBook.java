package hw_2_3;

import java.lang.reflect.Array;
import java.security.KeyStore;
import java.util.*;
import java.util.LinkedHashMap;

public class PhoneBook {


    private HashMap<String, ArrayList<Integer>> map = new HashMap<>();

    public void add(String name, int number) {
        if (!map.containsKey(name)) {
            ArrayList<Integer> arr= new ArrayList<>();
            arr.add(number);
            map.put(name, arr);
        } else {
            map.get(name).add(number);
        }
    }

    public ArrayList<Integer> get(String name) {
        return map.get(name);
    }

}
