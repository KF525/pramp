package sessions;

public class SudokuSolver {

    public boolean sudokuSolver(char[][] board) {
        return sudokuHelper(board, 0,0);
    }

    public boolean sudokuHelper(char[][] board, int row, int column) {
        //we stop when the row is off the board
        if (row == board.length) return true;

        int nextRow = row;
        int nextColumn = column + 1;

        if (column == board[0].length - 1) {
            nextRow = row + 1;
            nextColumn = 0;
        }

        //if it is already filled in, move on
        if (board[row][column] != '.') {
            return sudokuHelper(board, nextRow, nextColumn);
        }

        for (int i=1; i < board.length + 1; i++) {
            Character c = Character.forDigit(i, 10);
            board[row][column] = c; //set the value in the cell
            if (isValid(board, row, column)) { //check if it's valid
                if (sudokuHelper(board, nextRow, nextColumn)) { //if all subsequent cases are valid
                    return true;
                }
            }
        }

        board[row][column] = '.';
        return false; //board is not valid
    }

    private boolean isValid(char[][] board, int row, int column) {
        return isValidRowAndColumn(board, row, column) && isValid3x3(board, row, column);
    }

    private boolean isValidRowAndColumn(char[][] board, int row, int column) {
        for (int i=0; i < board.length; i++) {
            if (board[row][i] == board[row][column] && i != column) {
                return false;
            }
            if (board[i][column] == board[row][column] && i != row) {
                return false;
            }
        }

        return true;
    }

    private boolean isValid3x3(char[][] board, int row, int column) {
        int p1 = find3x3Corner(row);
        int p2 = find3x3Corner(column);

        for (int i = p1; i < p1 + 3; i++) {
            for (int j=p2; j < p2 + 3; j++) {
                if (board[i][j] == board[row][column] && i != row && j != column) {
                    return false;
                }
            }
        }

        return true;
    }

    private int find3x3Corner(int i) {
        if (i%3==0) {
            return i;
        } else {
            return find3x3Corner(i - 1);
        }
    }

}
