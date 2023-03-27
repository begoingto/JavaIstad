package MapCustomer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        TreeMap<String, Double> fruitCategories = new TreeMap<String, Double>();
        fruitCategories.put("apple",20.0);
        fruitCategories.put("banana",30.35);
        fruitCategories.put("arange",30.60);
        fruitCategories.put("mango",100.30);

        //HashSet<String, Double> uis = new HashSet<>(fruitCategories);




        System.out.println("headMap : "+fruitCategories.headMap("arange"));
        ArrayList<String> ls = new ArrayList<>();
        ls.add("Hello");
        ls.add("world");
        ls.add("Hello");
        ls.remove("world");
        System.out.println(ls);
    }
}
