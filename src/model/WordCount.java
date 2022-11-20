package model;
import interfaces.WordFrequency;

import java.util.*;

/**
 * @author Lars van der Schoor <larsvanderschoor@hotmail.com>
 * <p>
 * Case assessment Ordina November '22 - class for WordCount
 */
public class WordCount implements WordFrequency {
    Scanner keyboard = new Scanner(System.in);
    public String wordToGet;
    String inputText = "The sun shines over the lake";
    String[] words = inputText.toLowerCase().split(" ");

    public String getWord() {
        List<String> wordList = new ArrayList<>(List.of(words));
        for (int i = 0; i < wordList.size(); i++){
            if (wordList.contains(words)) {
                return wordToGet;
            }
        }
        return "not found";
    }

    public int getFrequency(){
        int count = 0;
        String wordToCount = keyboard.next();
        for (int i = 0; i < words.length; i++) {
            if (wordToCount.equals(words[i]))
                count++;
        }
        return count;
    }
}