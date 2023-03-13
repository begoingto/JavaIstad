public class MacBook implements Chip{
    String name;
    String model;
    private final String chip;
    double price;

    public MacBook(String name, String model, String chip, double price) {
        this.name = name;
        this.model = model;
        this.chip = chip;
        this.price = price;
    }

    @Override
    public String type() {
        return this.chip;
    }
}
