package Controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import model.*;
import model.Sentence;
import model.WordFrequencyAnalyzerClass;
/**
 * @author Lars van der Schoor <la.van.der.schoor@st.hanze.nl>
 * <p>
 * [omschrijving van code]
 */
public class WordCounter {

    public static void main(String[] args) {
        Sentence input = new Sentence();
        System.out.println("\nMade by Lars van der Schoor");
        System.out.println("Welcome to this text processing tool. Within this tool you can look in texts for " +
                "words and the frequency of words\n");



        // System.out.println(input.getWord());
        System.out.println(input.getFrequency());



//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Fill in sentence: ");
//
//        String sentence = keyboard.nextLine();
//
//        System.out.println("Your sentence is: " + sentence);
//        System.out.println("Find word: ");
//
//        String wordToFind = keyboard.next();
//
//        String [] words = sentence.split(" ");
//
//        List<String> wordList = new ArrayList<>(List.of(words));
//        if (wordList.contains(wordToFind)) {
//            System.out.println("Found it!");
//        } else {
//            System.out.println("404 word not found");
//        }



    }
}
