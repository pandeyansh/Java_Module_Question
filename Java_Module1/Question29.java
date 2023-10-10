import java.util.Scanner;
public class Question29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        int wordCount = countWords(sentence);
        System.out.println("Number of words in the sentence: " + wordCount);
        input.close();
    }
    public static int countWords(String sentence) {   
        String[] words = sentence.split("\\s+");
        return words.length;
    }
}