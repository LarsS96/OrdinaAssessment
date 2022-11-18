package model;

import interfaces.WordFrequency;
import interfaces.WordFrequencyAnalyzer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Lars van der Schoor <larsvanderschoor@hotmail.com>
 * <p>
 * Case assessment Ordina November '22 - Class for WordFrequencyAnalyzer
 */
public class WordFrequencyAnalyzerClass implements WordFrequencyAnalyzer {

    @Override
    public int calculateHighestFrequency(String inputText) {
        String [] words = inputText.split(" ");

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        int max = 0;
        int count = 1;
        String currentWord = words [0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(currentWord)){
                count++;
            } else {
                count = 1;
                currentWord = words [i];
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

    @Override
    public int calculateHighestFrequencyForWord(String inputText, String wordToFind) {
        String [] wordList = inputText.split(" ");
        int count = 0;
        for (int i = 0; i < wordList.length; i++) {
            if (wordToFind.equalsIgnoreCase(wordList[i]))
                count++;
        }
        System.out.printf("Amount of '%s': ", wordToFind);
        return count;
    }

    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String inputText, int n) {
        return null;
    }
}
