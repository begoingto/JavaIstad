package connectJDBC;

import connectJDBC.model.Topic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManageData {

    public static void connection(){

    }

    public static void selectTopic(Connection conn){
        try{
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
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void insertTopic(Connection conn, Topic topic){
        try{
            String sql = "INSERT INTO topics (name,description,status) VALUES(?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,topic.getName());
            statement.setString(2,topic.getDescription());
            statement.setBoolean(3,topic.isStatus());
            int count = statement.executeUpdate();
            System.out.println("""
                    ****************************************************
                    * Congratulation 🎉, You are created successfully. *
                    ****************************************************
                    """);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void updateTopic(Connection conn, Topic topic){
        try{
            String sql = "UPDATE topics SET name=?, description=?,status=? WHERE id="+ topic.getId();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,topic.getName());
            statement.setString(2,topic.getDescription());
            statement.setBoolean(3,topic.isStatus());
            int count = statement.executeUpdate();
            System.out.println("""
                    ****************************************************
                    * Congratulation 🎉, You are updated successfully. *
                    ****************************************************
                    """);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteTopic(Connection conn, Integer id){
        try{
            String sql = "DELETE FROM topics WHERE id="+ id;
            PreparedStatement statement = conn.prepareStatement(sql);
            int count = statement.executeUpdate();
            System.out.println("""
                    ****************************************************
                    * Congratulation 🎉, You are deleted successfully. *
                    ****************************************************
                    """);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    public static Topic selectTopicById(Connection conn, Integer id){
        try{
            String sql = "SELECT * FROM topics WHERE id="+ id;
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet =  statement.executeQuery();
            if (resultSet.next()){
                Integer gid = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String desc = resultSet.getString("description");
                boolean status = resultSet.getBoolean("status");
                return new Topic(id,name,desc,status);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static Topic selectTopicByName(Connection conn, String name){
        try{
            String sql = "SELECT * FROM topics WHERE name ILIKE '%"+ name+"'";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet =  statement.executeQuery();
            if (resultSet.next()){
                Integer id = resultSet.getInt("id");
                String gname = resultSet.getString("name");
                String desc = resultSet.getString("description");
                boolean status = resultSet.getBoolean("status");
                return new Topic(id,gname,desc,status);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}
