public class Car implements Vehicle {

    @Override
    public void accelerate(double distance) {
        System.out.println(String.format("The Car covered a number of distance %.2f", distance, "kms"));
    }
}
