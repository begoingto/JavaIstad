import java.time.LocalDateTime;
import java.util.UUID;

public class User
{
    private String uuid;
    private String username;
    private String password;
    private LocalDateTime createdDate;

    public void login(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.uuid = UUID.randomUUID().toString();
        this.createdDate = LocalDateTime.now();
    }

    public void show()
    {
        System.out.println("**************************************************************");
        System.out.println("*\tUUID: "+ this.uuid);
        System.out.println("*\tUSERNAME: "+ this.username);
        System.out.println("*\tPASSWORD: "+ this.password);
        System.out.println("*\tCREATE DATE: "+ DateTimeUtils.formatFullDateTime(this.createdDate,"dd-MMMM-YYYY hh:mm a"));
        System.out.println("**************************************************************");
    }

    @Override
    public String toString() {
        return "User{" +
                "\n\tuuid='" + uuid + '\'' +
                ", \n\tusername='" + username + '\'' +
                ", \n\tpassword='" + password + '\'' +
                ", \n\tcreatedDate=" + createdDate +
                "\n}";
    }
}
