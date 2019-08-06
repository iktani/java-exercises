package org.launchcode.java.studios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String phrase;
        HashMap<Character, Integer> charcounts = new HashMap<>();

        System.out.println("Enter a phrase: ");
        phrase = in.nextLine();

        char[] letters = phrase.toCharArray();

        for (char letter : letters) {
            if (charcounts.containsKey(letter)) {
                Integer currentCount = charcounts.get(letter);
                currentCount++;
                charcounts.put(letter,currentCount);

            } else {
                Integer startCount = 1;
                charcounts.put(letter, startCount);
            }
        }

        for (Map.Entry<Character, Integer> counter : charcounts.entrySet()) {
            System.out.println(counter.getKey() + ":" + counter.getValue());
        }



    }
}
