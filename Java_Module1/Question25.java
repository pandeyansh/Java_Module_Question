import java.util.Arrays;
public class Question25 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] concatenatedArray = concatenateArrays(array1, array2);
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));
    }
    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] result = new int[length1 + length2];   
        for (int i = 0; i < length1; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < length2; i++) {
            result[length1 + i] = arr2[i];
        }
        return result;
    }
}