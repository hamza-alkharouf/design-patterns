package designPatterns.template;

public class main {
    public static void main(String[] args) {
        VehicleTemplate car = new Car();
        car.buildCar();

        System.out.println("------------------------------");

        VehicleTemplate truck = new Truck();
        truck.buildCar();
    }
}
