import javax.swing.*;

public class Operations {

    private Matrix matrix;

    public Operations() {
    }

    public Operations(Matrix matrix) {
        this.matrix = matrix;
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }
    private static void showMatrix(int[][] matrix, String operation){
        System.out.println(operation);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static boolean verifySumAndSub(int[][]A, int[][]B){
        if(A.length== B.length && A[0].length == B[0].length){
            return true;
        }
        else return false;
    }
    private static boolean verifyMulti(int[][]A, int[][]B) {
        if(A[0].length == B.length){
            return true;
        }
        else return false;
    }

    public static void sumMatrices(int[][] matrixA, int[][] matrixB){
        if(verifySumAndSub(matrixA, matrixB)) {

            int[][] sum = new int[matrixA.length][matrixA[0].length];

            for (int i = 0; i < sum.length; i++) {
                for (int j = 0; j < sum[0].length; j++) {
                    sum[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
            showMatrix(sum, "- Sum -");
        }
        else
            System.out.println("Sum is not possible");
    }
    public static void subtractMatrices(int[][] matrixA, int[][] matrixB){
        if(verifySumAndSub(matrixA, matrixB)) {
            int[][] sub = new int[matrixA.length][matrixA[0].length];

            for (int i = 0; i < sub.length; i++) {
                for (int j = 0; j < sub[0].length; j++) {
                    sub[i][j] = matrixA[i][j] - matrixB[i][j];
                }
            }
            showMatrix(sub, "- Subtraction -");
        }
        else
            System.out.println("Subtraction is not possible");

    }
    public static void transposeMatrix(int[][] matrix){
        int[][] transposed  = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < transposed[0].length; i++) {
            for(int j=0; j< transposed.length; j++){
                transposed[j][i] = matrix[i][j];
            }
        }
        showMatrix(transposed, "- Transposed -");
    }
    public static void multiplyMatrices(int[][]A, int[][]B) {
        if (verifyMulti(A, B)) {
            int[][] multi = new int[A.length][B[0].length];

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < A[0].length; k++) {
                        multi[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            showMatrix(multi, "- Multiplication -");
        }
        else
            System.out.println("Multiplication is not possible");
    }
}

