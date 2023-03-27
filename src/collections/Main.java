package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<String> nameUsers = new ArrayList<>(){{
            add("Jonh");
            for (int i=0; i < 12 ; i++){
                add("Long_"+ i);
            }
        }};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(12,5,25));
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10,52,20,30));


        System.out.println("ArrayList values: "+ nameUsers);
        System.out.println("ArrayList asList: "+ nums);
        System.out.println("ArrayList List of: "+ numbers); */

        /* ArrayList<Integer> list = new ArrayList<>(List.of(10,52,20,30));
        System.out.println("Get element of list: "+ list.get(2));
        list.set(list.size()-1, 100);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("updated last element of list:" + list); */

        ArrayList<Student> students = new ArrayList<>(){{
            Student user1 = new Student(1010,"A Jonh",45.50f);
            Student user2 = new Student(2023,"Smith",75.50f);
            Student user3 = new Student(330,"B Long",60.50f);
            Student user4 = new Student(4082,"Bona",90.50f);
            add(user1);
            add(user2);
            add(user3);
            add(user4);
        }};

        /**
         * Sort by Object id
         * */
        System.out.println("********* sort by Student ID *********");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.id - o2.id;
            }
        });
        System.out.println(" Students: "+students);


        System.out.println("********* sort by Student Average Descending *********");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o2.average - o1.average);
            }
        });
        System.out.println(" Students: "+students);
    }
}
