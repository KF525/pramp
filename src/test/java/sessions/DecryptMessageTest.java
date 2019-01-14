package sessions;

import org.junit.Assert;
import org.junit.Test;

public class DecryptMessageTest {

    DecryptMessage decryptMessage = new DecryptMessage();

    @Test
    public void decryptMessageReturnsCorrectString() {
        String encryptedWord1 = "dnotq";
        String decryptedWord1 = "crime";

        String encryptedWord2 = "flgxswdliefy";
        String decryptedWord2 = "encyclopedia";

        String encryptedWord3 = "bvqmjhgghjmqvbiqzjugthwmdv";
        String decryptedWord3 = "abcdefghijklmnopqrstuvwxyz";

        Assert.assertEquals(decryptedWord1, decryptMessage.decrypt(encryptedWord1));
        Assert.assertEquals(decryptedWord2, decryptMessage.decrypt(encryptedWord2));
        Assert.assertEquals(decryptedWord3, decryptMessage.decrypt(encryptedWord3));
    }

    @Test
    public void decryptMessageHandlesEmptyString() {
        String encryptedWord = "";
        String decryptedWord = "";

        Assert.assertEquals(decryptedWord, decryptMessage.decrypt(encryptedWord));
    }

    @Test
    public void decryptMessage2ReturnsCorrectString() {
        String encryptedWord1 = "dnotq";
        String decryptedWord1 = "crime";

        String encryptedWord2 = "flgxswdliefy";
        String decryptedWord2 = "encyclopedia";

        String encryptedWord3 = "bvqmjhgghjmqvbiqzjugthwmdv";
        String decryptedWord3 = "abcdefghijklmnopqrstuvwxyz";

        Assert.assertEquals(decryptedWord1, decryptMessage.decryptMessage2(encryptedWord1));
        Assert.assertEquals(decryptedWord2, decryptMessage.decryptMessage2(encryptedWord2));
        Assert.assertEquals(decryptedWord3, decryptMessage.decryptMessage2(encryptedWord3));
    }
}
