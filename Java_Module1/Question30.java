import java.util.Scanner;
public class Question30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character to count: ");
        char targetChar = input.next().charAt(0);
        int count = countOccurrences(str, targetChar);
        System.out.println("Occurrences of '" + targetChar + "' in the string: " + count);
        input.close();
    }
    public static int countOccurrences(String str, char targetChar) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == targetChar) {
                count++;
            }
        }
        return count;
    }
}