package test;
import model.WordFrequencyAnalyzerClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * @author Lars van der Schoor <larsvanderschoor@hotmail.com>
 * <p>
 * Case assessment Ordina November '22 - Testclass for methods in the WordFrequencyAnalyzerClass
 */
public class WordFrequencyAnalyzerTest {
    WordFrequencyAnalyzerClass wordFrequencyAnalyzerClass = new WordFrequencyAnalyzerClass();

    @Test
    void testCalculateHighestFrequency(){
        // Arrange
        String inputText = "Every word one time";

        // Activate
        wordFrequencyAnalyzerClass.calculateHighestFrequency(inputText);

        // Assert
        assertEquals(1,wordFrequencyAnalyzerClass.calculateHighestFrequency(inputText));
    }

    @Test
    void testCalculateHighestFrequency2(){
        // Arrange
        String inputText = "Every one word One time";

        // Activate
        wordFrequencyAnalyzerClass.calculateHighestFrequency(inputText);

        // Assert
        assertEquals(2,wordFrequencyAnalyzerClass.calculateHighestFrequency(inputText));
    }

    @Test
    void testFrequencyForWord() {
        // Arrange
        String inputText = "Every word one time";
        String wordToFind = "one";

        // Activate
        wordFrequencyAnalyzerClass.calculateHighestFrequencyForWord(inputText, wordToFind);

        // Assert
        assertEquals(1,wordFrequencyAnalyzerClass.calculateHighestFrequencyForWord(inputText, wordToFind));
    }

    @Test
    void testFrequencyForWord2() {
        // Arrange
        String inputText = "Every One word one time";
        String wordToFind = "one";

        // Activate
        wordFrequencyAnalyzerClass.calculateHighestFrequencyForWord(inputText, wordToFind);

        // Assert
        assertEquals(2,wordFrequencyAnalyzerClass.calculateHighestFrequencyForWord(inputText, wordToFind));
    }
}
