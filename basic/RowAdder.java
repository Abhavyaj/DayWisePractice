package basic;

class RowAdder extends Thread {

    private int[][] A;
    private int[][] B;
    private int[][] res;
    private int row;

    public RowAdder(int[][] A, int[][] B, int[][] result, int row) {
        this.A = A;
        this.B = B;
        this.res = result;
        this.row = row;
    }

    @Override
    public void run() {
        for (int col = 0; col < A[0].length; col++) {
            res[row][col] = A[row][col] + B[row][col];
        }
        System.out.println("Row " + row + " completed by " + Thread.currentThread().getName());
    }
}
