package newfeatures;

public class Main {
    public static void main(String[] args) {
        String username = "Long";
        String user = """
                Long
                """;
        System.out.println(username);
        System.out.println(user);
        String source = """
                String message = "Hello, World!";
                System.out.println(message);
                """;
        System.out.println(source);
    }
}
