import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number Conversion Menu:");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Binary to Decimal");
        System.out.print("Enter your choice (1/2): ");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.print("Enter a decimal number: ");
            int decimalNumber = input.nextInt();
            String binary = decimalToBinary(decimalNumber);
            System.out.println("Binary representation: " + binary);
        } else if (choice == 2) {
            System.out.print("Enter a binary number: ");
            String binaryNumber = input.next();
            int decimal = binaryToDecimal(binaryNumber);
            System.out.println("Decimal representation: " + decimal);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
        input.close();
    }
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
}