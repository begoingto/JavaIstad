public class ISARelationship {
    public static void main(String[] args) {

        // IS-A-relation
        //Car car = new Audi();
        // car is not audi
        // car.logo cannot access

        //Casting not require to usage
        //Audi audi = (Audi) car;


        Engine engine = new Engine();
        engine.number = 4;
        Car car = new Car(engine);
        car.color = "red";
        car.wheel =4;
        System.out.println("=> Color : "+ car.color);
        System.out.println("=> Wheel : "+ car.wheel);
        System.out.println("=> Engine : "+ car.engine.number);

    }
}
