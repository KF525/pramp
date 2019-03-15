package daily_problems.Problem38;

public class NQueens {
/*
You have an N by N board. Write a function that, given N, returns the number of possible arrangements of the board where N queens can be placed on the board without threatening each other, i.e. no two queens share the same row, column, or diagonal.
 */
    static class Position {
        int row,col;

        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public boolean findValidPositionsForQueens(int n) {
        Position[] positions = new Position[n];
        boolean isValid = isValid(n, 0, positions);
        if (isValid) {
            //return positions;
            return true;
        } else {
            //return new Position[0];
            return false;
        }
    }

    public boolean isValid(int n, int row, Position[] positions) {
        if (n == row) { //base case - if we get through all the rows and are able to find safe spots for all queens
            return true;
        }

        int col; //for a given row, looking at a col
        for (col = 0; col < n; col++) { //going through each col
            boolean foundSafe = true; //started as true

            for (int queen = 0; queen < row; queen++) { //
                if (positions[queen].col == col ||
                        positions[queen].row + positions[queen].col == row + col
                        || positions[queen].row - positions[queen].col == row - col) { //all conditions in which queen is under attack
                    foundSafe = false; //if any of these cases are true, then we can't place a queen there
                    break;
                }
            }

            if (foundSafe) { //if we have found safe position we want to keep going
                positions[row] = new Position(row, col); //add position
                if (isValid(n, row + 1, positions)) { //call isValid with the next row and updated positions
                    return true;
                }
            }
        }
        return false;
    }
}

/*
Queen attacks same column, row, diagonally
share r value
share c value
for diagonal: if queen is at (1, 2) on (3,3) board
    --> (0,1), [1,2] (2,3)
    --> (3,0) (2,1) [1,2] (0,3)
    row - column (1,2) 1-2 = -1 any square whose r-c = -1 will be on the diagonal
    row + column for the other diagonal 1+2 = 3
since 4x4 board
recursion will be 4 levels deep
at 0 level of recursion we will place 0th queen on 0th row
on 1 level of recusion place the 1st queen such that she does not attack the 0th
on 2 level place the 2nd queen such that she does not attack 0th or 1st and so on
if at any time we cant find a square for queen on that row, return false for valid -
then go to previous row and try to find another spot for queen, if that doesn't work
then return false and go to its previous row
worst time complexity is exponential
worst space On
*/