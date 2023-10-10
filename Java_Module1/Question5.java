import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quadratic Equation Solver");
        System.out.print("Enter the coefficient 'a': ");
        double a = input.nextDouble();
        System.out.print("Enter the coefficient 'b': ");
        double b = input.nextDouble();
        System.out.print("Enter the coefficient 'c': ");
        double c = input.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two distinct real roots:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root:");
            System.out.println("Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Complex roots:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
        input.close();
    }
}