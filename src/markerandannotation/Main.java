package markerandannotation;

public class Main {
    public static void main(String[] args) {
        /* USER DEFINE Annotation
        **ApplePhone applePhone = new ApplePhone();
        applePhone.setCode(123);
        applePhone.setModel("Iphone 14");
        applePhone.setYear(2023);
        applePhone.setAppleBluetooth(new AppleBluetooth("802.11n"));

        Class<?> clazz = applePhone.getClass();

        if (clazz.isAnnotationPresent(SmartPhone.class)){
            System.out.println(applePhone.getAppleBluetooth());
        }*/
        PhoneLomBok applePhone = new PhoneLomBok();
        applePhone.setCode(123);
        applePhone.setModel("Iphone 14");
        applePhone.setYear(2023);
        applePhone.setAppleBluetooth(new AppleBluetooth("802.11n"));

        Class<?> clazz = applePhone.getClass();

        if (clazz.isAnnotationPresent(SmartPhone.class)){
            System.out.println(applePhone.getAppleBluetooth());
        }
    }
}
