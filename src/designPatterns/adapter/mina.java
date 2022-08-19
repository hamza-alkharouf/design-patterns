package designPatterns.adapter;

public class mina {
    public static void main(String[] args) {
        Vehicle car = new Car();
        useVehicle(car);

        Vehicle bike = new BicycleAdapter(new Bicycle());
        useVehicle(bike);
    }

    private static void useVehicle(Vehicle car) {
        car.accelerate();
        car.pushBreak();
        car.soundHorn();
        System.out.println();
    }
}
