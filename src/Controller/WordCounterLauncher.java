package Controller;
import java.util.Scanner;

import model.WordCount;
import model.WordFrequencyAnalyzerClass;

import javax.swing.text.StringContent;

/**
 * @author Lars van der Schoor <larsvanderschoor@hotmail.com>
 * <p>
 * Case assessment Ordina November '22 - WordCounterLauncher class
 */
public class WordCounterLauncher {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nMade by Lars van der Schoor");
        System.out.println("Welcome to this text processing tool. Within this tool you can look in texts for " +
                "words and the frequency of words\n");

        WordFrequencyAnalyzerClass wordFrequencyAnalyzerClass = new WordFrequencyAnalyzerClass();
        System.out.println("Insert text:");
        String inputText = keyboard.nextLine();
        while (inputText.isEmpty()) {
            System.out.println("Try again!");
            inputText = keyboard.nextLine();
        }
        System.out.print("The highest amount of the same word is: ");
        System.out.println(wordFrequencyAnalyzerClass.calculateHighestFrequency(inputText));

        System.out.println("\nWord to find: ");
        String wordToFind = keyboard.next();


        System.out.println(wordFrequencyAnalyzerClass.calculateHighestFrequencyForWord(inputText, wordToFind));

//        WordCount wordCount = new WordCount();
//
//        String s1 = wordCount.getWord();
//        String s2 = String.valueOf(wordCount.getFrequency());
//        String superString = s1.concat(s2);
//        System.out.println(wordFrequencyAnalyzerClass.calculateMostFrequentNWords(superString, 3));
    }
}
