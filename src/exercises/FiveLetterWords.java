package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class FiveLetterWords {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        String aword;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word (or Enter to finish): ");

        do {
            aword = in.nextLine();
            words.add(aword);

        } while(!aword.equals(""));

        countFives(words);
    }

    public static void countFives(ArrayList<String> wordlist) {
        for (String word : wordlist) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
