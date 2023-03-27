package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>(){{
            add("Jonh");
            add("Jonh");
            add("Long");
            add("Kim");
            add("Kim");
        }};

        System.out.println("Hash set name: "+ names);

        ArrayList<Integer> nums = new ArrayList<>(java.util.List.of(1,1,2,5,3,5,95,15));
        System.out.println("Normal List: "+ nums);
        HashSet<Integer> uniqueNums = new HashSet<>(nums);
        System.out.println("List remove duplication value: "+ uniqueNums);

        nums = new ArrayList<>(uniqueNums);
        nums.set(nums.size()-1, 100);
        System.out.println("Update value: "+ nums);
    }
}
