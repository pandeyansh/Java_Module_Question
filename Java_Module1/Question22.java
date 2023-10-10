import java.util.Arrays;
import java.util.Scanner;
public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = input.nextInt();
        System.out.print("Enter the size of the second array: ");
        int size2 = input.nextInt();
        if (size1 != size2) {
            System.out.println("Arrays are not equal since they have different sizes.");
            input.close();
            return;
        }
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = input.nextInt();
        }
        boolean areEqual = Arrays.equals(arr1, arr2);
        if (areEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
        input.close();
    }
}