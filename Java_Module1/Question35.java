import java.util.ArrayList;
import java.util.List;
class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
class ShoppingCart {
    private List<Product> cartItems;
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }
    public void addItem(Product product) {
        cartItems.add(product);
    }
    public void removeItem(Product product) {
        cartItems.remove(product);
    }
    public double calculateTotal() {
        double total = 0.0;
        for (Product item : cartItems) {
            total += item.getPrice();
        }
        return total;
    }
    public void displayCart() {
        System.out.println("Shopping Cart Contents:");
        for (Product item : cartItems) {
            System.out.println(item);
        }
        System.out.println("Total: $" + calculateTotal());
    }
}
public class Question35 {
    public static void main(String[] args) {
        Product product1 = new Product("Item 1", 10.0);
        Product product2 = new Product("Item 2", 20.0);
        Product product3 = new Product("Item 3", 15.0);
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(product1);
        cart.addItem(product2);
        cart.addItem(product3);
        System.out.println("Initial Shopping Cart:");
        cart.displayCart();
        cart.removeItem(product2);
        System.out.println("\nUpdated Shopping Cart:");
        cart.displayCart();
    }
}