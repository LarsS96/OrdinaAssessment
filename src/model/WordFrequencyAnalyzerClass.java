package model;

import interfaces.WordFrequency;
import interfaces.WordFrequencyAnalyzer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lars van der Schoor <larsvanderschoor@hotmail.com>
 * <p>
 * Case assessment Ordina November '22 - Class for WordFrequencyAnalyzer
 */
public class WordFrequencyAnalyzerClass implements WordFrequencyAnalyzer {

    public int calculateHighestFrequency(String inputText) {
        String[] words = inputText.toLowerCase().split(" ");
        Arrays.sort(words);
        int max = 0;
        int count = 1;
        String currentWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(currentWord)) {
                count++;
            } else {
                count = 1;
                currentWord = words[i];
            }
            if (max < count) {
                max = count;
            }
        }
        if (max < 1) {
            max = 1;
        }
        return max;
    }

    public int calculateHighestFrequencyForWord(String inputText, String wordToFind) {
        String[] wordList = inputText.split(" ");
        int count = 0;
        for (int i = 0; i < wordList.length; i++) {
            if (wordToFind.equalsIgnoreCase(wordList[i]))
                count++;
        }
        System.out.printf("Amount of '%s': ", wordToFind);
        return count;
    }


    public List<WordFrequency> calculateMostFrequentNWords(String inputText, int n) {
        List <WordFrequency> myList = new ArrayList<>();
        return myList;
    }
}
