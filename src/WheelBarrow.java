public class WheelBarrow implements Vehicle {

    @Override
    public void accelerate(double distance) {
        System.out.println(String.format("The wheelBarrow covered a number of distance %.2f", distance, "kms"));
    }
}
