package daily_problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ValidSentenceTest {

    ValidSentence validSentence = new ValidSentence();

    @Test
    public void validSentenceReturnsListOfWordsWhenValid() {
        List<String> dict = Arrays.asList("quick", "brown", "the", "fox");
        List<String> words = validSentence.returnValidSentence(dict, "thequickbrownfox");
        Assert.assertEquals(dict.size(), words.size());
    }

    @Test
    public void validSentenceReturnsListOfWordsWhenNotValid() {
        List<String> dict1 = Arrays.asList("quick", "brown", "the", "fox");
        Assert.assertNull(validSentence.returnValidSentence(dict1, "notinthelist"));

        List<String> dict2 = Arrays.asList("quick", "brown", "the", "fox");
        Assert.assertNull(validSentence.returnValidSentence(dict2, "quickbrownonlyhere"));
    }
}
