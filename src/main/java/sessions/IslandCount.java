package sessions;

public class IslandCount {
    int getNumberOfIslands(int[][] binaryMatrix) {
        int islandCount = 0;

        for (int r = 0; r < binaryMatrix.length; r++) {
            for (int c=0; c < binaryMatrix[0].length; c++) {
                if (binaryMatrix[r][c] == 0) continue;
                islandCount++;
                checkNeighbors(r,c, binaryMatrix);
            }
        }

        return islandCount;
        //iterate through int[][] ->
        //if it's 0 -> keep going
        //if it's 1 -> increment islandCount by 1, go north, south, east, west until a 0 is reached and as I pass 1s I will set them to 0.
    }

    void checkNeighbors(int r, int c, int[][] binaryMatrix) {
        if (r < 0 || r >= binaryMatrix.length || c < 0 || c >= binaryMatrix[0].length) {
            return;
        } else {
            if (binaryMatrix[r][c] == 1) {
                binaryMatrix[r][c] = 0;
                checkNeighbors(r, c+1, binaryMatrix);
                checkNeighbors(r, c-1, binaryMatrix);
                checkNeighbors(r+1, c, binaryMatrix);
                checkNeighbors(r-1, c, binaryMatrix);
            }
            return;
        }
    }
}
