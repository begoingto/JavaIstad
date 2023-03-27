package generic;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Jonh");
        User user2 = new User("Long");
        User user3 = new User("Kim");
        ArrayList<User> users = new ArrayList<>(Arrays.asList(user1,user2,user3));
        MyData<User,String> data = new MyData<>(user1,"You are student right?");
        System.out.println(data.getData().name);
        System.out.println(data.getMessage());
    }
}
