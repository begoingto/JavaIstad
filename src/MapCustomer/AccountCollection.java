package MapCustomer;

import java.util.*;

public class AccountCollection {
    public static void main(String[] args) {
        UserAccount user1 = new UserAccount(1,"Jonh",15.0);
        UserAccount user2 = new UserAccount(2,"Smith",50.50);
        UserAccount user3 = new UserAccount(3,"Long",100.50);
        ArrayList<UserAccount> users = new ArrayList<>(Arrays.asList(user1,user2,user3));

        // show Items
        for (UserAccount user : users) {
            System.out.println(user.toString());
        }

        // sort
        
    }
}
