import java.lang.Math;
class Shape {
    public double calculateArea() {
        return 0.0;
    }
    public double calculatePerimeter() {
        return 0.0;
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
public class Question34 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        Circle circle = new Circle(3.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("\nCircle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference (Perimeter): " + circle.calculatePerimeter());
    }
}