package daily_problems;

//TODO: Complete this.
public class TravelMatrix {

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
