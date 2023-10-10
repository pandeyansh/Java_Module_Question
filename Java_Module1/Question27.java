import java.util.Scanner;
public class Question27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " + longestWord);
        input.close();
    }
    public static String findLongestWord(String sentence) {   
        String[] words = sentence.split("\\s+"); 
        String longestWord = "";
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}