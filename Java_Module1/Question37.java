abstract class ElectronicGadget {
    private String brand;
    private String model;
    private double price;
    public ElectronicGadget(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public abstract String describeFunctionality();
    @Override
    public String toString() {
        return "Brand: " + brand + "\n" +
               "Model: " + model + "\n" +
               "Price: $" + price + "\n" +
               "Functionality: " + describeFunctionality();
    }
}
class Smartphone extends ElectronicGadget {
    private String screenSize;
    private int megapixels;
    public Smartphone(String brand, String model, double price, String screenSize, int megapixels) {
        super(brand, model, price);
        this.screenSize = screenSize;
        this.megapixels = megapixels;
    }
    @Override
    public String describeFunctionality() {
        return "A smartphone with a " + screenSize + " screen and " + megapixels + "MP camera.";
    }
}
class Laptop extends ElectronicGadget {
    private String processor;
    private int ram;
    public Laptop(String brand, String model, double price, String processor, int ram) {
        super(brand, model, price);
        this.processor = processor;
        this.ram = ram;
    }
    @Override
    public String describeFunctionality() {
        return "A laptop with a " + processor + " processor and " + ram + "GB of RAM.";
    }
}
public class Question37 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Apple", "iPhone 13", 999.99, "6.1-inch", 12);
        Laptop laptop = new Laptop("Dell", "XPS 15", 1499.99, "Intel Core i7", 16);
        System.out.println("Smartphone Details:\n" + smartphone + "\n");
        System.out.println("Laptop Details:\n" + laptop);
    }
}