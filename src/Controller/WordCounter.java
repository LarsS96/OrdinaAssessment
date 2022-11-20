package Controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import model.*;
import model.WordFrequencyAnalyzerClass;
/**
 * @author Lars van der Schoor <la.van.der.schoor@st.hanze.nl>
 * <p>
 * [omschrijving van code]
 */
public class WordCounter {
    Scanner keyboard = new Scanner(System.in);
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
        //System.out.println(wordFrequencyAnalyzerClass.calculateMostFrequentNWords(inputText, 2));
    }
}
