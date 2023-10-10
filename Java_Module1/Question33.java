class Vehicle {
    private String make;
    private String model;
    private int year;
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public void start() {
        System.out.println("Starting the vehicle.");
    }
    public void stop() {
        System.out.println("Stopping the vehicle.");
    }
    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}
class Car extends Vehicle {
    private int numberOfDoors;
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    @Override
    public void start() {
        System.out.println("Starting the car.");
    }
    @Override
    public void stop() {
        System.out.println("Stopping the car.");
    }
    @Override
    public String toString() {
        return super.toString() + " - " + numberOfDoors + " doors";
    }
}
class Motorcycle extends Vehicle {
    private String type;
    public Motorcycle(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }
    public String getType() {
        return type;
    }
    @Override
    public void start() {
        System.out.println("Starting the motorcycle.");
    }
    @Override
    public void stop() {
        System.out.println("Stopping the motorcycle.");
    }
    @Override
    public String toString() {
        return super.toString() + " - " + type;
    }
}
public class Question33 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2023, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2022, "Sport");
        System.out.println("Car Details: " + car);
        car.start();
        car.stop();
        System.out.println("\nMotorcycle Details: " + motorcycle);
        motorcycle.start();
        motorcycle.stop();
    }
}