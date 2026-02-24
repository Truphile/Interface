public class Bike implements Vehicle {

    @Override
    public void accelerate(double distance) {
        System.out.println(String.format("The bike accelerated %.2f", distance,"kms"));
    }
}
