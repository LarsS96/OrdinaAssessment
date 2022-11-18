package model;
import interfaces.WordFrequency;

import java.util.*;

/**
 * @author Lars van der Schoor <larsvanderschoor@hotmail.com>
 * <p>
 * Case assessment Ordina November '22
 */
public class Sentence implements WordFrequency {
    Scanner keyboard = new Scanner(System.in);
    public String wordToGet;
    String inputText = keyboard.nextLine();

    public String getWord() {
        String[] words = inputText.split(" ");
        List<String> wordList = new ArrayList<>(List.of(words));
        System.out.println("Word to find: ");
        wordToGet = keyboard.next();
        if (wordList.contains(wordToGet)) { // IgnoreCase ?
            return String.format("Word '%s' is found in the text\n",
                    wordToGet);
        } else {
            return "\nnot found";
        }
    }

    public int getFrequency(){
        String [] wordList = inputText.split(" ");
        int count = 0;
        System.out.println("Find: ");
        String wordToCount = keyboard.next();
        for (int i = 0; i < wordList.length; i++) {
            if (wordToCount.equalsIgnoreCase(wordList[i]))
                count++;
        }
        System.out.printf("Amount of '%s': ", wordToCount);
        return count;
    }
}