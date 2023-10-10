import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
        input.close();
    }
}