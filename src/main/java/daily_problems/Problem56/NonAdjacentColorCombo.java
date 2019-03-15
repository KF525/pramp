package daily_problems.Problem56;

public class NonAdjacentColorCombo {
/*
Given an undirected graph represented as an adjacency matrix and an integer k, write a function to determine whether each vertex in the graph can be colored such that no two adjacent vertices share the same color using at most k colors.
 */
    public boolean isColorComboPossible(int[][] matrix, int k) {
        int[] colors = new int[matrix.length];
        return isColorComboPossibleHelper(matrix, k, colors, 1);
    }

    public boolean isColorComboPossibleHelper(int[][] matrix, int k, int[] colors, int currentIndex) {

        colors[0] = 1;

        if (currentIndex == colors.length) return true;

        for (int c = 1; c <= k; c++) {
            colors[currentIndex] = c;
            if (isValid(matrix, colors, currentIndex)) {
                if (isColorComboPossibleHelper(matrix, k, colors, currentIndex + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isValid(int[][] matrix, int[] colors, int currentIndex) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][currentIndex] == 1 && colors[i] == colors[currentIndex]) {
                return false;
            }
        }
        return true;
    }
}
