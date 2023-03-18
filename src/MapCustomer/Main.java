package MapCustomer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Object> fruits = new HashMap<>();
        fruits.put("apple",null);
        fruits.put("banana",30.35);
        fruits.put("orange",30);
        fruits.put("mango","Name");
        fruits.put("apple", 100);
        for (Map.Entry<String, Object> stringObjectEntry : fruits.entrySet()) {
            System.out.println(stringObjectEntry.getValue());
        }
        System.out.println(fruits);
    }
}
