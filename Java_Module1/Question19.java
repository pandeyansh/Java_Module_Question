import java.util.Scanner;
public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
        input.close();
    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10; 
            sum += digit; 
            num /= 10; 
        }
        return sum;
    }
}