public class Question39 {
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; 
        }
        return num1 / num2;
    }
    public static void main(String[] args) {
        Question39 calculator = new Question39();
        double num1 = 10.0;
        double num2 = 5.0;
        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }
}