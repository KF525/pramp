package daily_problems.Problem56;

import daily_problems.Problem56.NonAdjacentColorCombo;
import org.junit.Assert;
import org.junit.Test;

public class NonAdjacentColorComboTest {

    NonAdjacentColorCombo nonAdjacentColorCombo = new NonAdjacentColorCombo();

    @Test
    public void isColorComboPossibleReturnsTrueIfPossible() {
        int[][] matrix = {{0,1,1,1}, {1,0,1,0}, {1,1,0,1},{1,0,1,0}};
        Assert.assertTrue(nonAdjacentColorCombo.isColorComboPossible(matrix, 3));
    }

    @Test
    public void isColorComboPossibleReturnsFalseIfNotPossible() {
        int[][] matrix = {{0,1,1,1}, {1,0,1,0}, {1,1,0,1},{1,0,1,0}};
        Assert.assertFalse(nonAdjacentColorCombo.isColorComboPossible(matrix, 2));
    }
}
