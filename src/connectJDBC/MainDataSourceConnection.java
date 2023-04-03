package connectJDBC;

import java.sql.SQLException;

public class MainDataSourceConnection {
    public static void main(String[] args) {
        TopicApplication app = new TopicApplication();
        String username = "postgres";
        String password = "root";
        String database = "javaJDBC";
        try {
            app.setConnection(username,password,database);
            while (true){
                app.getStart();
                switch (app.option){
                    case 1 -> app.select();
                    case 2 -> app.insert();
                    case 3 -> app.update();
                    case 4 -> app.delete();
                    case 5 -> app.selectByID();
                    case 6 -> app.selectByName();
                    case 7 -> System.exit(0);
                    default -> System.out.println("Something when wrong!!!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
