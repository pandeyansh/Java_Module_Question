import java.util.Arrays;
import java.util.HashSet;
public class Question26 {
    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 2, 8, 4, 10, 12, 12, 14 };
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueArray));
    }
    public static int[] removeDuplicates(int[] arr) {   
        HashSet<Integer> uniqueSet = new HashSet<>();
        int[] uniqueArray;
        for (int num : arr) {
            uniqueSet.add(num);
        }
        uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }
        return uniqueArray;
    }
}