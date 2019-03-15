package sessions;

import junit.framework.Assert;
import org.junit.Test;

public class SentenceReverseTest {

    SentenceReverse sentenceReverse = new SentenceReverse();

    @Test
    public void reverseSentenceCorrectlyReversesSentence() {
        char[] sentence = new char[]{'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',
                'm', 'a', 'k', 'e', 's', ' ',
                'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'};

        char[] expectedResult = new char[]{'p', 'r', 'a', 'c', 't', 'i', 'c', 'e', ' ',
                'm', 'a', 'k', 'e', 's', ' ',
                'p', 'e', 'r', 'f', 'e', 'c', 't'};

        char[] result = sentenceReverse.reverse(sentence);

        for (int i=0; i < result.length; i++) {
            Assert.assertTrue(expectedResult[i] == result[i]);
        }
    }
}
