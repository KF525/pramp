package daily_problems;

import org.junit.Assert;
import org.junit.Test;

public class StringCompressionTest {

    StringCompression stringCompression = new StringCompression();

    @Test
    public void encodeStringReturnsStringCompressed() {
        Assert.assertEquals("4A3B2C1D2A", stringCompression.encodeString("AAAABBBCCDAA"));
    }

    @Test
    public void decodeStringReturnsString() {
        Assert.assertEquals("AAAABBBCCDAA", stringCompression.decodeString("4A3B2C1D2A"));

    }
}
