package daily_problems.Problem38;

import daily_problems.Problem38.NQueens;
import org.junit.Assert;
import org.junit.Test;

public class NQueensTest {

    NQueens nQueens = new NQueens();

    @Test
    public void findValidPositionsForQueensReturnsValidPositionsWhenTrue() {
        NQueens.Position[] expectedPositions = new NQueens.Position[4];
        NQueens.Position position1 = new NQueens.Position(0, 1);
        NQueens.Position position2 = new NQueens.Position(1, 3);
        NQueens.Position position3 = new NQueens.Position(2, 0);
        NQueens.Position position4 = new NQueens.Position(3, 2);
        expectedPositions[0] = position1;
        expectedPositions[1] = position2;
        expectedPositions[2] = position3;
        expectedPositions[3] = position4;
        //NQueens.Position[] acutalPositions = nQueens.findValidPositionsForQueens(4);
        //Assert.assertArrayEquals(expectedPositions, acutalPositions);
        Assert.assertTrue( nQueens.findValidPositionsForQueens(4));
    }

    @Test
    public void findValidPositionsForQueensReturnsFalseIfNoValidPathsExist() {
        Assert.assertFalse(nQueens.findValidPositionsForQueens(3));
    }
}
