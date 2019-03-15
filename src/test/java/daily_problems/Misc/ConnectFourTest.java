package daily_problems.Misc;

import daily_problems.Misc.ConnectFour;
import junit.framework.Assert;
import org.junit.Test;

public class ConnectFourTest {

    ConnectFour connectFour = new ConnectFour();

    @Test
    public void isCompleteDiaganolReturnsTrueIfFourInRow() {
        int[][] board = {
                {1,0,0,0},
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1}};

        Assert.assertTrue(connectFour.isCompleteDiaganol(board, 2, 2));
        Assert.assertTrue(connectFour.isCompleteDiaganol(board, 0, 0));
        Assert.assertTrue(connectFour.isCompleteDiaganol(board, 1, 1));
        Assert.assertTrue(connectFour.isCompleteDiaganol(board, 3, 3));
    }

    @Test
    public void isCompleteDiagonalReturnsFalseIfCountLessThanFour() {
        int[][] board = {
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}};
        Assert.assertFalse(connectFour.isCompleteDiaganol(board, 2, 2));
        Assert.assertFalse(connectFour.isCompleteDiaganol(board, 1, 1));
        Assert.assertFalse(connectFour.isCompleteDiaganol(board, 3, 3));
    }

    @Test
    public void isCompleteDiagonalReturnsHandlesRightDiagonal() {
        /*
         0 0 0 1
         0 0 1 0
         0 1 0 0
         1 0 0 0
         */
        //(0,3) (1,2) (2,1) (3,0)
        int[][] board = {
                {0,0,0,1},
                {0,0,1,0},
                {0,1,0,0},
                {1,0,0,0}
        };

        Assert.assertTrue(connectFour.isCompleteDiaganol(board, 0, 3));
        Assert.assertTrue(connectFour.isCompleteDiaganol(board, 1, 2));
        Assert.assertTrue(connectFour.isCompleteDiaganol(board, 2, 1));
        Assert.assertTrue(connectFour.isCompleteDiaganol(board, 3, 0));
    }

    @Test
    public void isCompleteRowReturnsTrueIfWinner() {
        int[][] board = {
                {0,0,0,1},
                {0,0,1,0},
                {1,1,1,1},
                {1,0,0,0}
        };

        Assert.assertTrue(connectFour.isCompleteRow(board, 2,1));
    }


    @Test
    public void isCompleteColumnReturnsTrueIfWinner() {
        int[][] board = {
                {0,1,0,1},
                {0,1,1,0},
                {1,1,0,1},
                {0,1,0,0}
        };

        Assert.assertTrue(connectFour.isCompleteColumn(board, 3, 1));
    }
}
