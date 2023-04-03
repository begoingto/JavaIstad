package connectJDBC;

import connectJDBC.model.Topic;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MainDriverManagerConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/javaJDBC";
        String username = "postgres";
        String password = "root";
        try(Connection conn = DriverManager.getConnection(url,username,password)) {
            //1. Create SQL statement
            String sql = "SELECT * FROM topics";
            PreparedStatement statement = conn.prepareStatement(sql);
            //2. Execute sql
            ResultSet resultSet =  statement.executeQuery();
            // 3. Result
            List<Topic> topics = new ArrayList<>();
            while (resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String desc = resultSet.getString("description");
                boolean status = resultSet.getBoolean("status");
                topics.add(new Topic(id,name,desc,status));
            }

            for (Topic topic: topics) {
                System.out.println(topic);
            }
            //System.out.println(conn.getSchema());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
