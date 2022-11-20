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
        int highest = 0;
        int amount = 1;
        String currentWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(currentWord)) {
                amount++;
            } else {
                amount = 1;
                currentWord = words[i];
            }
            if (highest < amount) {
                highest = amount;
            }
        }
        if (highest < 1) {
            highest = 1;
        }
        return highest;
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


    public List<WordFrequency> calculateMostFrequentNWords(String inputText, int n) { // not completed
        List <WordFrequency> myList = new ArrayList<>();
        String[] words = inputText.toLowerCase().split(" ");
        WordCount wordCount = new WordCount();
        for (int index = 0; index < words.length; index++) {
            wordCount.inputText = inputText;
            wordCount.wordToGet = words[index];
            myList.add(wordCount);
        }
        return myList;
    }
}

