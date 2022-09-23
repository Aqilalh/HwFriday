public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(4);
        Car car1 = new Car("buggati", 1, 20, 30, engine);
        Truck truck1 = new Truck("ford", 1, 34, 54, engine);
        Bike bike1 = new Bike("speed", 1, 21, 34);
        RollerCoaster rollerCoaster = new RollerCoaster(50, 45);
        Horse horse1 = new Horse("beyonce", 1, 3, 4);
        Vehicle[] vehicles = {car1, truck1, bike1, horse1};
        RideAble[] rideAbles = {horse1, rollerCoaster, bike1};
        VehicleApp.printVehiclesNameAndPrices(vehicles);
        VehicleApp.getSpeedOfAnRideableObjects(rideAbles);
        for (Vehicle i : vehicles){
            System.out.println(i.totalBeforeTax(vehicles[3]));
        }
        for(Vehicle i : vehicles)
       // for (int i = 0; i < vehicles.length; i++) {
            i.totalAfterTax(vehicles[3]);
        }
    }
