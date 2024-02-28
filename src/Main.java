import java.util.Scanner;

public class Main {
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        int m = 2, n = 3;
        System.out.println("- Matrix A - ");
        Matrix matrixA = new Matrix(m,n);
        matrixA.setMatrix(new int[m][n]);
        matrixA.createMatrix();
        matrixA.showMatrix();

        System.out.println("\n- Matrix B -");
        int p = 3, q = 4;
        Matrix matrixB = new Matrix(p,q);
        matrixB.setMatrix(new int[p][q]);
        matrixB.createMatrix();
        matrixB.showMatrix();

        Menu menu = new Menu();
        System.out.println("\n"+menu.menu());
        boolean exit = true;

        do{
            System.out.print("\nChoose an operation -> ");
            int options = Integer.parseInt(input.nextLine());
                switch (options) {
                    case 1 -> Operations.sumMatrices(matrixA.getMatrix(), matrixB.getMatrix());
                    case 2 -> Operations.subtractMatrices(matrixA.getMatrix(), matrixB.getMatrix());
                    case 3 -> {
                        int choose = menu.chooseTranspose();
                        switch (choose) {
                            case 1 -> Operations.transposeMatrix(matrixA.getMatrix());
                            case 2 -> Operations.transposeMatrix(matrixB.getMatrix());
                            default -> {
                                System.out.println("Number is not valid");
                                break;
                            }
                        }
                    }
                    case 4 -> Operations.multiplyMatrices(matrixA.getMatrix(), matrixB.getMatrix());
                    case 5 -> {System.out.println("Exiting...");
                                exit = false;}
                    default -> System.out.println("Number is not valid");
                }
        }while(exit);
    }
}