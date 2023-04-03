package connectJDBC;

import connectJDBC.model.Topic;
import org.postgresql.ds.PGSimpleDataSource;
import org.postgresql.jdbc.PgConnection;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class TopicApplication {
    public Integer option;
    private final Scanner scanner = new Scanner(System.in);
    public Connection connection;

    public void getStart(){
        System.out.println("""
                ******************* Topic Application ****************************
                1. Select of Topic
                2. Insert of Topic
                3. Update Topic by ID of Topic
                4. Delete by ID of Topic
                5. Select by ID of Topic
                6. Select by Name of Topic
                7. Exit
                """);
        System.out.print("=> Please choose option: ");
        option = scanner.nextInt();
    }

    public void setConnection(String username, String password, String db) throws SQLException {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setDatabaseName(db);
        this.connection =  dataSource.getConnection();
    }

    public void select(){
        ManageData.selectTopic(this.connection);
        this.pressEnterContinue();
        this.scanner.nextLine();
    }

    public void selectByID(){
        System.out.println("************* Select Topic by ID *************");
        this.scanner.nextLine();
        System.out.print("=> Enter ID: ");
        int id = this.scanner.nextInt();
        Topic topic =  ManageData.selectTopicById(this.connection,id);
        System.out.println(topic);
        this.pressEnterContinue();
        this.scanner.nextLine();
    }

    public void selectByName(){
        System.out.println("************* Select Topic by Name *************");
        this.scanner.nextLine();
        System.out.print("=> Enter Name: ");
        String name = this.scanner.nextLine();
        Topic topic =  ManageData.selectTopicByName(this.connection,name);
        System.out.println(topic);
        this.pressEnterContinue();
        this.scanner.nextLine();
    }

    public void insert(){
        System.out.println("************* Form Topic Create *************");
        this.scanner.nextLine();
        Topic topic = new Topic();
        System.out.print("=> Enter Name: ");
        topic.setName(this.scanner.nextLine());
        System.out.print("=> Enter Description: ");
        topic.setDescription(this.scanner.nextLine());
        topic.setStatus(true);
        ManageData.insertTopic(this.connection,topic);
        this.pressEnterContinue();
    }

    public void update(){
        System.out.println("************* Form Topic Update *************");
        this.scanner.nextLine();
        Topic topic = new Topic();
        System.out.print("=> Enter ID: ");
        topic.setId(this.scanner.nextInt());
        this.scanner.nextLine();
        System.out.print("=> Enter Name: ");
        topic.setName(this.scanner.nextLine());
        System.out.print("=> Enter Description: ");
        topic.setDescription(this.scanner.nextLine());
        topic.setStatus(true);
        ManageData.updateTopic(this.connection,topic);
        this.pressEnterContinue();
    }

    public void delete(){
        System.out.println("************* Form Topic Delete *************");
        this.scanner.nextLine();
        System.out.print("=> Enter ID: ");
        int id = this.scanner.nextInt();
        ManageData.deleteTopic(this.connection,id);
        this.pressEnterContinue();
        this.scanner.nextLine();
    }

    private void pressEnterContinue(){
        System.out.println("Press enter continue...");
        this.scanner.nextLine();
    }
}
