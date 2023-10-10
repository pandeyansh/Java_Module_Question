import java.util.HashMap;
import java.util.Map;
public class Question24 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 8, 3, 4, 2, 8, 1, 4, 9, 2, 7, 8, 3, 9 };
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(element + " occurs " + frequency + " times");
        }
    }
}