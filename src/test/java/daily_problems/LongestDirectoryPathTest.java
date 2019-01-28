package daily_problems;

import org.junit.Assert;
import org.junit.Test;

public class LongestDirectoryPathTest {
    LongestDirectoryPath longestPath = new LongestDirectoryPath();

    @Test
    public void pathToTreeReturnsTreeForm() {
        longestPath.pathToTree("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext", "\\n\\t");
    }

    @Test
    public void getLongestPathReturnsLongestCharacterCountPath() {
        Assert.assertEquals(20, longestPath.getLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
        Assert.assertEquals(32, longestPath.getLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
    }
}
