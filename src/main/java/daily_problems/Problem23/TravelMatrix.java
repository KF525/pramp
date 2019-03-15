package daily_problems.Problem23;

//TODO: Complete this.
public class TravelMatrix {
/*
You are given an M by N matrix consisting of booleans that represents a board. Each True boolean represents a wall. Each False boolean represents a tile you can walk on.

Given this matrix, a start coordinate, and an end coordinate, return the minimum number of steps required to reach the end coordinate from the start. If there is no possible path, then return null. You can move up, left, down, and right. You cannot move through walls. You cannot wrap around the edges of the board.

For example, given the following board:

[[f, f, f, f],
[t, t, f, t],
[f, f, f, f],
[f, f, f, f]]
and start = (3, 0) (bottom left) and end = (0, 0) (top left), the minimum number of steps required to reach the end is 7, since we would need to go through (1, 2) because there is a wall everywhere else on the second row.
 */

    public Integer minimumStepsPath(boolean[][] matrix) {
        return pathHelper(matrix, matrix[0].length - 1,0, 0);
    }

    public Integer pathHelper(boolean[][] matrix, int r, int c, int steps) {
        if (r == 0 && c ==0) return 1;
        if (r == matrix[0].length || c == matrix.length) {
            return 0;
        }
        if (!matrix[r][c]) {
            return 0;
        }
        return 0;
    }
}


//start bottom left
//end top right
//can go up left down right
//if it is a false nope
//if it is out of bounds nope
//if we get to 0,0 then we found a valid path
//use a cache?
