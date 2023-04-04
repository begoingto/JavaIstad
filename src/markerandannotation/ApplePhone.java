package markerandannotation;

@SmartPhone
public class ApplePhone {
    private Integer code;
    private String model;
    private Integer year;
    @Bluetooth(speed = "3.4GHz")
    private AppleBluetooth appleBluetooth;

    public ApplePhone() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public AppleBluetooth getAppleBluetooth() {
        return appleBluetooth;
    }

    public void setAppleBluetooth(AppleBluetooth appleBluetooth) {
        this.appleBluetooth = appleBluetooth;
    }

    @Override
    public String toString() {
        return "ApplePhone{" +
                "code=" + code +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", appleBluetooth=" + appleBluetooth +
                '}';
    }
}
