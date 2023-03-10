public class Application
{
    public static void main(String[] args) {
        User user = new User();
        user.login("admin","123");
        user.show();
    }
}
