package markerandannotation;

public class AppleBluetooth {
    private String model;

    public AppleBluetooth(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "AppleBluetooth{" +
                "model='" + model + '\'' +
                '}';
    }
}
