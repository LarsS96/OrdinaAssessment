package model;
import interfaces.WordFrequency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Lars van der Schoor <larsvanderschoor@hotmail.com>
 * <p>
 * Case assessment Ordina November '22
 */
public class Sentence implements WordFrequency {
    Scanner keyboard = new Scanner(System.in);
    public String wordToGet;

    public String getWord() {
        System.out.println("Fill in sentence: ");
        String inputText = keyboard.nextLine();
        String[] words = inputText.split(" ");
        List<String> wordList = new ArrayList<>(List.of(words));
        System.out.println("Word to find: ");
        wordToGet = keyboard.next();
        if (wordList.contains(wordToGet)) {
            return wordToGet;
        } else {
            return "not found";
        }
    }

    public int getFrequency(){
        System.out.println("Fill in sentence: ");
        String wordList [] = keyboard.nextLine().split(" ");
        int count = 0;
        System.out.println("Find: ");
        String wordToCount = keyboard.next();
        for (int i = 0; i < wordList.length; i++) {
            if (wordToCount.equalsIgnoreCase(wordList[i]))
                count++;
        }
        System.out.println("Amount of " + wordToCount + ": " + count);
        return count;
    }
}