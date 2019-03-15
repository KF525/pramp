package daily_problems.Problem54;

public class Sudoku {
    /*
    Sudoku is a puzzle where you're given a partially-filled 9 by 9 grid with digits. The objective is to fill the grid with the constraint that every row, column, and box (3 by 3 subgrid) must contain all of the digits from 1 to 9.

Implement an efficient sudoku solver.
     */
    public boolean sudokuSolver(char[][] board) {
        return sudokuHelper(board, 0, 0);
//       if (sudokuHelper(board, 0,0)) {
//           return board;
//       } else {
//           return null;
//       }
    }

    boolean sudokuHelper(char[][] board, int row, int column) {
        if (row == board.length) return true;

        int nextRow = row;
        int nextColumn = column + 1;

        if (column == 8) {
            nextRow = row + 1;
            nextColumn = 0;
        }

        if (board[row][column] != '.') {
            return sudokuHelper(board, nextRow, nextColumn);
        }

        for (int i = 1; i < board.length + 1; i++) {
            board[row][column] = Character.forDigit(i, 10);

            if (isValid(board, row, column)) { //combine into one if statement?
                if (sudokuHelper(board, nextRow, nextColumn)) {
                    return true;
                }
            }

            board[row][column] = '.';

        }

        return false;
    }

    boolean isValid(char[][] board, int row, int column) {
        return isValid3x3(board, row, column) && isValidColumnAndRow(board, row, column);
    }

    boolean isValid3x3(char[][] board, int row, int column) {
        int c1 = findPosition(row);
        int c2 = findPosition(column);

        for (int i = c1; i < (c1 + 3); i++) {
            for (int j = c2; j < (c2 + 3); j++) {
                if (board[i][j] == board[row][column] && i != row && j != column) {
                    return false;
                }
            }
        }
        return true;
    }

    int findPosition(int c) {
        if (c % 3 == 0) {
            return c;
        } else {
            return findPosition(c - 1);
        }
    }

    boolean isValidColumnAndRow(char[][] board, int row, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == board[row][column] && i != column) {
                return false;
            }
            if (board[i][column] == board[row][column] && i != row) {
                return false;
            }
        }
        return true;
    }

    public void printSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0)
                System.out.println("-------------------------");
            for (int j = 0; j < board.length; j++) {
                if (j % 3 == 0) System.out.print("| ");
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------------------");
    }
}
