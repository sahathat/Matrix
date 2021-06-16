package matrix;

public class Matrix {

    private final int dimention;

    public Matrix(int dimention) {
        this.dimention = dimention;
    }

    public void printMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] add(int[][] A, int[][] B) {
        int[][] add = new int[dimention][dimention];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                add[i][j] = A[i][j] + B[i][j];
            }
        }
        return add;
    }

    public int[][] subAB(int[][] A, int[][] B) {
        int[][] sub = new int[dimention][dimention];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                sub[i][j] = A[i][j] - B[i][j];
            }
        }
        return sub;
    }

    public int[][] transpose(int[][] A) {
        int[][] transpose = new int[dimention][dimention];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                transpose[i][j] = A[j][i];
            }
        }
        return transpose;
    }

    public int[][] multiple(int[][] A, int[][] B) {
        int[][] muit = new int[dimention][dimention];
        for (int i = 0; i < dimention; i++) {
            for (int j = 0; j < dimention; j++) {
                for (int k = 0; k < dimention; k++) {
                    muit[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return muit;
    }

    public int determinant(int[][] A) {
        int result = 0;
        if (A.length == 1) {
            result = A[0][0];
            return result;
        }
        if (A.length == 2) {
            result = A[0][0] * A[1][1] - A[0][1] * A[1][0];
            return result;
        }
        for (int i = 0; i < A[0].length; i++) {
            int temp[][] = new int[A.length - 1][A[0].length - 1];

            for (int j = 1; j < A.length; j++) {
                for (int k = 0; k < A[0].length; k++) {

                    if (k < i) {
                        temp[j - 1][k] = A[j][k];
                    } else if (k > i) {
                        temp[j - 1][k - 1] = A[j][k];
                    }
                }
            }
            result += A[0][i] * Math.pow(-1, (int) i) * determinant(temp);
        }
        return result;
    }
}
