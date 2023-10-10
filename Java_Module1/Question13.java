import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Arithmetic Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1/2/3/4/5): ");
            choice = input.next().charAt(0);
            if (choice >= '1' && choice <= '4') {
                System.out.print("Enter the first number: ");
                double num1 = input.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = input.nextDouble();
                double result = 0;
                switch (choice) {
                    case '1':
                        result = num1 + num2;
                        break;
                    case '2':
                        result = num1 - num2;
                        break;
                    case '3':
                        result = num1 * num2;
                        break;
                    case '4':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero.");
                            continue; 
                        }
                        break;
                }
                System.out.println("Result: " + result);
            } else if (choice != '5') {
                System.out.println("Invalid choice. Please enter a valid operation.");
            }
        } while (choice != '5');
        System.out.println("Exiting the calculator. Goodbye!");
        input.close();
    }
}