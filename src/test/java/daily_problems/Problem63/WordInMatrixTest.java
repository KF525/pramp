package daily_problems.Problem63;

import daily_problems.Problem63.WordInMatrix;
import org.junit.Assert;
import org.junit.Test;

public class WordInMatrixTest {

    WordInMatrix wordInMatrix = new WordInMatrix();

    @Test
    public void isWordPresentReturnsTrueIfPresentInRow() {
        char[][] matrix = {
                {'M', 'A', 'S','S'},
                {'B', 'A', 'S', 'S'},
                {'L', 'A','S','S'}};
        Assert.assertTrue(wordInMatrix.isWordPresent(matrix, "MASS"));
        Assert.assertTrue(wordInMatrix.isWordPresent(matrix, "BASS"));
        Assert.assertTrue(wordInMatrix.isWordPresent(matrix, "LASS"));
    }

    @Test
    public void isWordPresentReturnsTrueIfPresentInColumn() {
        char[][] matrix = {
                {'F', 'A', 'C', 'I'},
                {'O', 'B', 'Q', 'P'},
                {'A', 'N', 'O', 'B'},
                {'M', 'A', 'S', 'S'}};
        Assert.assertTrue(wordInMatrix.isWordPresent(matrix, "FOAM"));

        char[][] matrix2= {
                {'F', 'F', 'C', 'I'},
                {'O', 'O', 'Q', 'P'},
                {'R', 'R', 'O', 'B'},
                {'M', 'T', 'S', 'S'}};

        Assert.assertTrue(wordInMatrix.isWordPresent(matrix2, "FORT"));

        char[][] matrix3 = {
                {'F', 'A', 'C', 'I'},
                {'O', 'B', 'Q', 'P'},
                {'A', 'A', 'O', 'B'},
                {'M', 'R', 'S', 'S'}};
        Assert.assertTrue(wordInMatrix.isWordPresent(matrix3, "BAR"));
    }

    @Test
    public void isWordPresentReturnsFalseIfNotPresent() {
        char[][] matrix = {
                {'M', 'A', 'S','S'},
                {'B', 'A', 'S', 'S'},
                {'L', 'A','S','T'}};
        Assert.assertFalse(wordInMatrix.isWordPresent(matrix, "LASH"));
        Assert.assertFalse(wordInMatrix.isWordPresent(matrix, "LASTS"));
    }
    
}
