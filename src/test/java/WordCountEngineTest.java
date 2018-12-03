import org.junit.Assert;
import org.junit.Test;

public class WordCountEngineTest {

    WordCountEngine wordCountEngine = new WordCountEngine();

    @Test
    public void wordCountEngineReturnsOrderedListBasedOnFrequency() {
        String[][] expected = new String[][] {{"test", "3"}, {"here", "2"}, {"i", "1"}};
        Assert.assertArrayEquals(expected, wordCountEngine.wordCountEngine("Test test test here here I"));
    }
}

/*
Implement a document scanning function wordCountEngine, which receives a string document
and returns a list of all unique words in it and their number of occurrences,
sorted by the number of occurrences in a descending order.
If two or more words have the same count, they should be sorted according to their order
in the original sentence.
Case insensitive
The engine should strip out punctuation (even in the middle of a word)
and use whitespaces to separate words.
*/
