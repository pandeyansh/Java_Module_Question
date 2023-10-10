import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
        input.close();
    }
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit; 
            num /= 10; 
        }
        return reversed;
    }
}