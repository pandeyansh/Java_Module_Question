import java.util.Scanner;
public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        if (n < 2) {
            System.out.println("At least two elements are required for finding the second largest.");
            input.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest element is: " + secondLargest);
        input.close();
    }
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num != largest && num > secondLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}