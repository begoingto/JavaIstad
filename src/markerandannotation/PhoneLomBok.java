package markerandannotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SmartPhone
public class PhoneLomBok {
    private Integer code;
    private String model;
    private Integer year;
    @Bluetooth(speed = "3.4GHz")
    private AppleBluetooth appleBluetooth;
}
