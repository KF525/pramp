package daily_problems;

public class WordInMatrix {
    /*
    Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found in the matrix by going left-to-right, or up-to-down.
    For example, given the following matrix:

    [['F', 'A', 'C', 'I'],
    ['O', 'B', 'Q', 'P'],
    ['A', 'N', 'O', 'B'],
    ['M', 'A', 'S', 'S']]

    and the target word 'FOAM', you should return true, since it's the leftmost column. Similarly, given the target word 'MASS', you should return true, since it's the last row.
    */

    public boolean isWordPresent(char[][] matrix, String word) {
        if (word.length() > matrix[0].length) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == word.charAt(0)) {
                    if (checkRow(matrix, i, j + 1, word)) {
                        return true;
                    }
                    if (checkColumn(matrix, i+1, j, word)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean checkRow(char[][] matrix, int row, int col, String word) {
        int wordIndex = 1;
        int cIndex = col;

        while (wordIndex < word.length()) {
            if (matrix[0].length - cIndex < word.length() - wordIndex) {
                return false;
            }

            if (word.charAt(wordIndex) != matrix[row][cIndex]) {
                return false;
            }

            wordIndex++;
            cIndex++;
        }

        return true;
    }

    private boolean checkColumn(char[][] matrix, int row, int col, String word) {
        int wordIndex = 1;
        int rIndex = row;

        while (wordIndex < word.length()) {
            if (matrix[0].length - rIndex < word.length() - wordIndex) {
                return false;
            }

            if (word.charAt(wordIndex) != matrix[rIndex][col]) {
                return false;
            }

            wordIndex++;
            rIndex++;
        }

        return true;
    }
}