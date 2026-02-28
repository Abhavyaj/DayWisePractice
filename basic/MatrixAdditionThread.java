package basic;

public class MatrixAdditionThread {
	public static void main(String[] args) throws InterruptedException {

        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11,12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };

        int[][] B = {
        		{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11,12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };

        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        RowAdder[] threads = new RowAdder[rows];

        for (int i = 0; i < rows; i++) {
            threads[i] = new RowAdder(A, B, result, i);
            threads[i].start();
        }

        for (int i = 0; i < rows; i++) {
            threads[i].join();
        }

        System.out.println("Final Result Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

}}
