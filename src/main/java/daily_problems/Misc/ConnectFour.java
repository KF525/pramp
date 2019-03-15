package daily_problems.Misc;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConnectFour {

//
//    Integer doThing(Function<Integer, Integer> func, int v) {
//        return func.apply(v);
//    }
//
//    Integer doThing(Supplier<Integer> func) {
//        return func.get();
//    }

    public boolean isCompleteRow(int[][] board, int x, int y) {
        int rightCount = getRowCount(board, x, y+1, 0, (i) -> i + 1);
        int leftCount = getRowCount(board, x, y-1, 0, (i) -> i - 1);
        if (rightCount + leftCount >= 3) {
            return true;
        } else {
            return false;
        }
    }

    private int getRowCount(int[][] board, int x, int y, int count, Function<Integer, Integer> function) {
        if (y > board.length - 1 || y < 0) return count;
        if (board[x][y] != 1) return count;
        return getRowCount(board, x, function.apply(y), count+1, function);
    }

    public boolean isCompleteColumn(int[][] board, int x, int y) {
        int count = getColumnCount(board, x, y, 0, (i) -> i - 1);
        if (count >= 3) {
            return true;
        } else {
            return false;
        }
    }

    private int getColumnCount(int[][] board, int x, int y, int count, Function<Integer, Integer> function) {
        if (x < 0) return count;
        if (board[x][y] != 1) return count;
        return getColumnCount(board, function.apply(x), y, count+1, function);
    }

    public boolean isCompleteDiaganol(int[][] board, int x, int y) {
        int c3 = getDiaganolCount(board, x + 1, y - 1, 0, (x1) -> x1 + 1, (y1) -> y1 - 1);
        int c4 = getDiaganolCount(board, x - 1, y + 1, 0, (x1) -> x1 - 1, (y1) -> y1 + 1);
        int c1 = getDiaganolCount(board, x + 1, y + 1, 0, (x1) -> x1 + 1, (y1) -> y1 + 1);
        int c2 = getDiaganolCount(board, x-1, y-1, 0, (x1) -> x1 - 1, (y1) -> y1 - 1);
        if ((c1 + c2) >= 3 || (c3 + c4) >= 3) {
            return true;
        } else {
            return false;
        }
    }

    private int getDiaganolCount(int[][] board, int x, int y, int count, Function<Integer, Integer> xFunction, Function<Integer, Integer> yFunction) {
        if (x < 0 || x > board.length - 1 || y < 0 || y > board.length - 1) return count;
        if (board[x][y] != 1) return count;
        return getDiaganolCount(board, xFunction.apply(x), yFunction.apply(y), count+1, xFunction, yFunction);
    }
}
