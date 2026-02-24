public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle wheelBarrow = new WheelBarrow();
        Vehicle bike = new Bike();

        car.accelerate(500);
        wheelBarrow.accelerate(20);
        bike.accelerate(700);
    }
}
