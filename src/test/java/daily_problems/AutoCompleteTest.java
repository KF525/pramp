package daily_problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoCompleteTest {

    AutoComplete autoComplete = new AutoComplete();

    @Test
    public void returnsAllWordsThatMatchInput() {
        List<String> words = new ArrayList<>(); //TODO: understand why
        words.add("deer");
        words.add("dog");
        words.add("dear");
        words.add("eye");
        words.add("deal");

        List<String> expectedWords = Arrays.asList("deer", "dear", "deal");

        Assert.assertEquals(expectedWords.size(), autoComplete.returnPossibleWords("de", words ).size());
    }
}
