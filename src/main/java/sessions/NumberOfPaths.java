package sessions;

public class NumberOfPaths {

    public int returnNumberOfPathsBruteForce(int r, int c, int n) {
        if (r == n-1 && c == n-1) {
            return 1;
        } else if (r >= n || c >= n || r < c) {
            return 0;
        } else {
            return returnNumberOfPathsBruteForce(r + 1, c, n)
                    + returnNumberOfPathsBruteForce(r, c + 1, n);
        }
    }

    public int returnNumberOfPathsWithStore(int r, int c, int n) {
        int[][] cache = new int[n][n];

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                cache[a][b] = -1; //set cache to -1
            }
        }

        if (r == n-1 && c == n-1) return 1;
        if (r >= n || c >= n || r < c) return 0;
        if (cache[r][c] == -1) { //see if we already have that value in our cache
            cache[r][c] = returnNumberOfPathsBruteForce(r + 1, c, n)
                    + returnNumberOfPathsBruteForce(r, c + 1, n); //if not generate it
        }

        return cache[r][c]; //otherwise return it
    }

    public int returnNumberOfPathsWithStoreDynamically(int n) {
        int[][] grid = new int[n][n];

        for (int c = 0; c < grid.length; c++) {
            grid[n-1][c] = 1; //set all squares in last column to 1, (the rest are 0 by default)
        }

        for (int c = n-2; c >= 0; c--) {
            for (int r = n-2; r >= c; r--) {
                grid[r][c] = grid[r+1][c] + grid[r][c+1];  //the updated grid - add one above and one to the right
            }
        }

        return grid[0][0]; //until you go through the entire grid, then return the final answer at 0,0
    }
}
