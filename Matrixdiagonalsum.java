package Week_1.Day_4;

public class Matrixdiagonalsum {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length - 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j || i == len - j) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
