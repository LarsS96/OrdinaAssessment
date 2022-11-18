package model;

import interfaces.WordFrequency;
import interfaces.WordFrequencyAnalyzer;

import java.util.List;

/**
 * @author Lars van der Schoor <larsvanderschoor@hotmail.com>
 * <p>
 * Case assessment Ordina November '22 - Class for WordFrequencyAnalyzer
 */
public class WordFrequencyAnalyzerClass implements WordFrequencyAnalyzer {
    @Override
    public int calculateHighestFrequency(String text) {

        return 0;
    }

    @Override
    public int calculateHighestFrequencyForWord(String text, String word) {
        return 0;
    }

    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {
        return null;
    }
}
