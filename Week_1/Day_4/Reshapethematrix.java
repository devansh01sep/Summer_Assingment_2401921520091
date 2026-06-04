package Week_1.Day_4;

public class Reshapethematrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if ((m * n) != (r * c)) {
            return mat;
        }
        int[][] output = new int[r][c];
        int row = 0;
        int column = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                output[row][column] = mat[i][j];
                column++;
                if (column == c) {
                    column = 0;
                    row++;
                }
            }
        }
        return output;

    }
}
