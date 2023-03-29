package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>(){{
            put("a", " Phnom Penh, Cambodia");
            put("b", " Bangkok, Thailand");
        }};

        Map<String, StudentApp.Student> studentList = new HashMap<>();
        studentList.put("MI-1001", new StudentApp.Student("Jonh",20,new float[]{10,25,30,25,98}));
        studentList.put("MI-1002", new StudentApp.Student("Funny",19,new float[]{36,55,25,25,75}));

        studentList.put(null,null);
//        TreeMap<String, StudentApp.Student> stu = new TreeMap<>(studentList);
//        stu.put(null,null);
//        System.out.println(stu);

        for (Map.Entry<String, StudentApp.Student> student: studentList.entrySet()){
            System.out.println("Key and Value: "+ student.getValue());
        }

        studentList.entrySet().stream().forEach((e) -> System.out.println(e));
    }
}
