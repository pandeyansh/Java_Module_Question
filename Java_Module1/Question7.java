import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)) {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        input.close();
    }
}