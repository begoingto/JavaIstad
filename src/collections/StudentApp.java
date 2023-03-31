package collections;

import java.util.*;

public class StudentApp {
    static class Student {
        String name;
        Integer age;
        float[] scores = new float[5];

        Student(){}

        public Student(String name, Integer age, float[] scores) {
            this.name = name;
            this.age = age;
            this.scores = scores;
        }

        public float average(){
            float sum=0;
            for (int i=0;i<this.scores.length;i++){
                sum+=this.scores[i];
            }
            return sum / this.scores.length;
        }

        @Override
        public String toString() {
            return "Student{" +
                   "name='" + name + '\'' +
                   ", age=" + age +
                   ", scores=" + Arrays.toString(scores) +
                   ", Average=" + average() +
                   '}';
        }
    }
    public static void main(String[] args) {
        float[] scoreII = new float[]{25,12,45,30,75};
        List<Student> students = new ArrayList<>(){{
            add(new Student("John",18,new float[]{10,52,12,30,25}));
            add(new Student("Smith",20, scoreII));
        }};
//        System.out.println(students);

        for (Student student: students){
            System.out.println(student);
        }


        // list init value
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,23,23,5,5,8,9,10));
        System.out.println("Original values");
        System.out.println(list);

        //remove duplicate
        System.out.println("After update");
        Set<Integer> unique = new LinkedHashSet<>(list);
        list = new ArrayList<>(unique);
        System.out.println(list);
        list.set(list.size()-1,99);
        System.out.println(list);

        // method reference
        System.out.println("method reference");
        list.stream().forEach(System.out::println);

        // lamda expression
        System.out.println("lamda expression");
        list.stream().forEach(e -> System.out.println(e*2));

        // Iterator
        System.out.println("Iterator");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
