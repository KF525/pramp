package daily_problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StringToMultipleTextsTest {

    StringToMultipleTexts stringToMultipleTexts = new StringToMultipleTexts();

    @Test
    public void generateStringsReturnsListOfSubstringsIfValid() {
        List<String> str = stringToMultipleTexts.generateStrings("the quick brown fox jumps over the lazy dog", 10);
        Assert.assertEquals(5, str.size());
    }

    @Test
    public void generateStirngsReturnsNullIfInvalid() {
        Assert.assertNull(stringToMultipleTexts.generateStrings("supercalifragilisticexpialidocious", 10));
    }
}

