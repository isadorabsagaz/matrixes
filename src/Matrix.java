import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Matrix {

    private int[][]matrix;
    private int m;
    private int n;
    private Random random = new Random();

    public Matrix() {
    }
    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void createMatrix(){
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                this.matrix[i][j] = this.random.nextInt(10);
            }
        }
    }
    public void showMatrix(){
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print(this.matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
