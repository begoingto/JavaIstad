public class Computer {
    public static void main(String[] args) {
        MacBook mac1 = new MacBook("Macbook pro","EF001","M1",1999.99);

        System.out.println("=> Name:"+ mac1.name);
        System.out.println("=> Model:"+ mac1.name);
        System.out.println("=> Chip:"+ mac1.type());
        System.out.println("=> Price:"+ mac1.price);
    }
}
