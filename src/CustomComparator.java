public class CustomComparator {
    public static void main(String[] args) {
        Vehicle vehicle = (double distance)->{
            System.out.println("vehicle accelerated for" + distance + "KM");
        };

        printDistanceCoveredBy((double distance)->{
            System.out.println("vehicle accelerated for " + distance + "KM");
        });
    }
    private static  void printDistanceCoveredBy(Vehicle vehicle) {
        vehicle.accelerate(50);
    }
}
