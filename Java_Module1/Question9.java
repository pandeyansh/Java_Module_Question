import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int numTerms = input.nextInt();
        System.out.println("Fibonacci Sequence:");
        int term1 = 0;
        int term2 = 1;
        System.out.print(term1 + " " + term2 + " ");
        for (int i = 3; i <= numTerms; i++) {
            int nextTerm = term1 + term2;
            System.out.print(nextTerm + " ");
            term1 = term2;
            term2 = nextTerm;
        }
        input.close();
    }
}